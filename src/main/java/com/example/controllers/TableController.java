package com.example.controllers;

import com.example.models.Probe;
import com.example.models.Types;
import com.example.models.Units;
import com.example.pojo.ProbeRequest;
import com.example.repo.ProbeRepository;
import com.example.repo.TypeRepository;
import com.example.repo.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TableController {

    @Autowired
    private ProbeRepository probeRepository;

    @Autowired
    private UnitRepository unitRepository;

    @Autowired
    private TypeRepository typeRepository;

    @GetMapping("/table")
    public ResponseEntity<List> moderatorAccess() {
        List<Probe> probes = probeRepository.findAll();

        return new ResponseEntity<>(probes, HttpStatus.OK);
    }

    @GetMapping("/table/edit/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List> editingPage(@PathVariable("id") int id){
        List<Probe> probes = probeRepository.findAll();
        Probe p = probes.stream().filter(probe ->id==probe.getId()).findAny().orElse(null);
        List<Probe> pl = new ArrayList<>();
        pl.add(p);
        List<Units> units = unitRepository.findAll();
        List<Types> types = typeRepository.findAll();
        List<List> listOfLists = new ArrayList<>();
        listOfLists.add(units);
        listOfLists.add(types);
        listOfLists.add(pl);
        return new ResponseEntity<>(listOfLists, HttpStatus.OK);
    }

    @PostMapping("/table/edit/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void editingProbe(@PathVariable("id") int id,@RequestBody ProbeRequest probeRequest){
       Probe probe = probeRepository.findById(id).orElseThrow();
        probe.setName(probeRequest.getName());
        probe.setModel(probeRequest.getModel());
        probe.setRange_from(probeRequest.getRange_from());
        probe.setRange_to(probeRequest.getRange_to());
        probe.setLocation(probeRequest.getLocation());
        probe.setUnit(probeRequest.getUnit());
        probe.setType(probeRequest.getType());
        probe.setDescription(probeRequest.getDescription());//
        probeRepository.save(probe);
    }

    @PostMapping("/table/add")
    @PreAuthorize("hasRole('ADMIN')")
    public void addProbe(@RequestBody ProbeRequest probeRequest) {
        Probe probe = new Probe(probeRequest.getName(),
                probeRequest.getModel(),
                probeRequest.getRange_from(),
                probeRequest.getRange_to(),
                probeRequest.getLocation(),
                probeRequest.getUnit(),
                probeRequest.getType(),
                probeRequest.getDescription());
        probeRepository.save(probe);
    }

    @GetMapping("/table/add")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List>  addPage() {
        List<Units> units = unitRepository.findAll();
        List<Types> types = typeRepository.findAll();
        List<List> listOfLists = new ArrayList<>();
        listOfLists.add(units);
        listOfLists.add(types);
        return new ResponseEntity<>(listOfLists, HttpStatus.OK);
    }
}
