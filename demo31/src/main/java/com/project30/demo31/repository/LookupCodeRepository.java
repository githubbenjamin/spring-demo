package com.project30.demo31.repository;

import com.project30.demo31.entity.LookupCodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LookupCodeRepository extends JpaRepository<LookupCodeEntity, Long> {
}
