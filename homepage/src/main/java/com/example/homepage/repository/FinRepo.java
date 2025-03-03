package com.example.homepage.repository;

import com.example.homepage.entity.FinEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinRepo extends JpaRepository<FinEntity, Integer> {
}
