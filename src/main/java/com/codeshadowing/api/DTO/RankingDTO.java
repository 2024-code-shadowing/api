package com.codeshadowing.api.DTO;

public interface RankingDTO {
    Integer getCodeId();
    Integer getRankPos();
    Integer getExecutionLogAvgWpm();
    Integer getExecutionLogAccuracy();
    Integer getExecutionLogScore();
    Integer getTriedUserId();
    String getTriedUserName();
}
