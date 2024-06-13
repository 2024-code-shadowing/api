package com.codeshadowing.api.Payload.Response;

import com.codeshadowing.api.DTO.CodeContentDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class ContentsResponse {
    String title;
    List<CodeContentDTO> data;
}
