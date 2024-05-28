package com.codeshadowing.api.Repository;

import com.codeshadowing.api.Entity.TempExecutionLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TempExecutionLogRepository extends JpaRepository<TempExecutionLog, Integer> {
}
