package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Duvida;
import org.springframework.stereotype.Repository;

@Repository
public interface DuvidaRepository extends JpaRepository<Duvida, Long> {

}
