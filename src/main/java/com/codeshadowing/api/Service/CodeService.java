package com.codeshadowing.api.Service;

import com.codeshadowing.api.DTO.CodeContentDTO;
import com.codeshadowing.api.DTO.CodeDTO;
import com.codeshadowing.api.Entity.Code;
import com.codeshadowing.api.Payload.Response.ContentsResponse;
import com.codeshadowing.api.Payload.Response.TitleResponse;
import com.codeshadowing.api.Repository.CodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CodeService {

    @Autowired
    private CodeRepository codeRepository;

    private CodeDTO mapToDTO(Code code) {
        CodeDTO dto = new CodeDTO();
        dto.setTitle(code.getTitle());
        dto.setLine(code.getLine());
        dto.setCodeId(code.getId());
        return dto;
    }

    public ResponseEntity<TitleResponse> getTitles() {
        ArrayList<CodeDTO> titles = (ArrayList<CodeDTO>) codeRepository.findAll().stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());

        return ResponseEntity
                .ok(new TitleResponse(titles.size(), titles));
    }

    public ResponseEntity<?> getCodeContents(Integer codeId) {
        Code code = codeRepository.findById(codeId).orElse(null);
        if (code == null) {
            return ResponseEntity.notFound().build();
        }

        List<CodeContentDTO> contents = splitCodeContentIntoPages(code.getContents());

        return ResponseEntity.ok(new ContentsResponse(code.getTitle(), contents));
    }

    private List<CodeContentDTO> splitCodeContentIntoPages(String content) {
        String[] lines = content.split("\n");

        List<CodeContentDTO> result = new ArrayList<>();
        int lineCount = lines.length;
        int pageCount = (lineCount + 20) / 21;

        int startLineIndex = 0;
        for (int page = 1; page <= pageCount; page++) {
            int pageTotalLine = 0;
            List<CodeContentDTO.Line> pageContent = new ArrayList<>();
            int endLineIndex = Math.min(startLineIndex + 21, lineCount);

            for (int i = startLineIndex; i < endLineIndex; i++) {
                pageContent.add(new CodeContentDTO.Line(i + 1, lines[i]));
                pageTotalLine++;
            }

            CodeContentDTO pageDTO = new CodeContentDTO(page, pageContent, pageTotalLine);
            result.add(pageDTO);

            startLineIndex = endLineIndex;
        }

        return result;
    }
}
