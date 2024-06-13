package com.codeshadowing.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class CodeContentDTO {
    private int page;
    private List<Line> content;
    private int totalLine;

    @Getter
    @Setter
    @AllArgsConstructor
    public static class Line {
        private int line;
        private String content;
    }
}
