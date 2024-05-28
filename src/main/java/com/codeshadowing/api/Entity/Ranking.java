package com.codeshadowing.api.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ranking {

    @Id
    private Integer codeId;
    private Integer rankPos;
    private Integer executionLogAvgWpm;
    private Integer executionLogAccuracy;
    private Integer executionLogScore;
    private Integer triedUserId;
    private String triedUserName;
}