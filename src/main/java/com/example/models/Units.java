package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Units {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String unit_of_probes;

    public Units(String unit_of_probes) {
        this.unit_of_probes = unit_of_probes;
    }

    public Units() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnit_of_probes() {
        return unit_of_probes;
    }

    public void setUnit_of_probes(String unit_of_probes) {
        this.unit_of_probes = unit_of_probes;
    }
}
