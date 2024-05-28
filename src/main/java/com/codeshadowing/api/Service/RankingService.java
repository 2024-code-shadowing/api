package com.codeshadowing.api.Service;

import com.codeshadowing.api.DTO.RankingDTO;
import com.codeshadowing.api.Repository.RankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankingService {

    @Autowired
    private RankingRepository rankingRepository;

    public List<RankingDTO> getTopRankings() {
        return rankingRepository.findTopRankings();
    }
}
