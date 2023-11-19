package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Doe;
import org.springframework.stereotype.Repository;

@Repository
public interface DoeRepository extends JpaRepository<Doe, Long>{

}
