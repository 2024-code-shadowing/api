package com.codeshadowing.api.Repository;

import com.codeshadowing.api.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TriedUserRepository extends JpaRepository<TriedUser, Integer> {}

