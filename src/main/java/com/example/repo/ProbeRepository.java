package com.example.repo;



import com.example.models.Probe;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProbeRepository extends CrudRepository<Probe, Integer> {
    List<Probe> findAll();
}
