package com.example.controllers;

import com.example.models.Probe;
import com.example.repo.ProbeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TableController {

    @Autowired
    private ProbeRepository probeRepository;

    @GetMapping("/table")
    public ResponseEntity<List> moderatorAccess() {
        List<Probe> probes = probeRepository.findAll();

        return new ResponseEntity<>(probes, HttpStatus.OK);
    }
}
