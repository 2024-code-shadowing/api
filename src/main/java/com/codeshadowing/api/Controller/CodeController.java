package com.codeshadowing.api.Controller;

import com.codeshadowing.api.Service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/codes")
public class CodeController {

    @Autowired
    private CodeService codeService;

    @GetMapping("/titles")
    public ResponseEntity<?> getTitles(){
        return codeService.getTitles();
    }

    @GetMapping("/contents/{codeId}")
    public ResponseEntity<?> getCodeContents(@PathVariable("codeId") Integer codeId){
        return codeService.getCodeContents(codeId);
    }
}
