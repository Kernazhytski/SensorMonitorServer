package com.example.repo;


import com.example.models.Units;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UnitRepository extends CrudRepository<Units, Integer> {
    List<Units> findAll();
}
