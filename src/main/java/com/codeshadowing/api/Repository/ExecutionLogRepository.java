package com.codeshadowing.api.Repository;

import com.codeshadowing.api.Entity.ExecutionLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecutionLogRepository extends JpaRepository<ExecutionLog, Integer> {
}
