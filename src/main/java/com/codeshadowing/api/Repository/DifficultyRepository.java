package com.codeshadowing.api.Repository;

import com.codeshadowing.api.Entity.Difficulty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DifficultyRepository extends JpaRepository<Difficulty, Integer> {
}
