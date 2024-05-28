package com.codeshadowing.api.Service;

import com.codeshadowing.api.DTO.CodeDTO;
import com.codeshadowing.api.Entity.Code;
import com.codeshadowing.api.Payload.Response.TitleResponse;
import com.codeshadowing.api.Repository.CodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
}
