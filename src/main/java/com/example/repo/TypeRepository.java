package com.example.repo;


import com.example.models.Types;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TypeRepository extends CrudRepository<Types, Integer> {
    List<Types> findAll();
}
