package com.codeshadowing.api.Payload.Response;

import com.codeshadowing.api.DTO.CodeDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
public class TitleResponse {
    public Integer total;
    public ArrayList<CodeDTO> contents;
}
