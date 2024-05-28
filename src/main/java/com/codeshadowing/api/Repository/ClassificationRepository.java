package com.codeshadowing.api.Repository;

import com.codeshadowing.api.Entity.Classification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassificationRepository extends JpaRepository<Classification, Integer> {
}
