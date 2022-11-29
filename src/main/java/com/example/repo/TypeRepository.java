package com.example.repo;

import com.example.SensorMonitor.domain.Types;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TypeRepository extends CrudRepository<Types, Integer> {
    List<Types> findAll();
}
