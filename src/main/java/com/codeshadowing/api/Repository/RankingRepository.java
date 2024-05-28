package com.codeshadowing.api.Repository;

import com.codeshadowing.api.DTO.RankingDTO;
import com.codeshadowing.api.Entity.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RankingRepository extends JpaRepository<Ranking, Integer> {

    @Query(value = "SELECT code_id AS codeId, " +
            "rank_pos AS rankPos, " +
            "execution_log_avg_wpm AS executionLogAvgWpm, " +
            "execution_log_accuracy AS executionLogAccuracy, " +
            "execution_log_score AS executionLogScore, " +
            "tried_user_id AS triedUserId, " +
            "tried_user_name AS triedUserName " +
            "FROM ranking " +
            "WHERE execution_log_accuracy >= 95 " +
            "AND deleted_at IS NULL " +
            "ORDER BY execution_log_score DESC",
            nativeQuery = true)
    List<RankingDTO> findTopRankings();
}
