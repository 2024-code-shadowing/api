package com.codeshadowing.api.Controller;

import com.codeshadowing.api.DTO.RankingDTO;
import com.codeshadowing.api.Service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rankings")
public class RankingController {

    @Autowired
    private RankingService rankingService;

    @GetMapping
    public List<RankingDTO> getTopRankings() {
        return rankingService.getTopRankings();
    }
}
