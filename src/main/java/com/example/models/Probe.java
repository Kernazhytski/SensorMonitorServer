package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Probe {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;


    private String Name;


    private String Model;


    private int Range_from;


    private int Range_to;


    private String Location;

    private String Unit;


    private String Type;

    private String Description;

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public Probe(String name, String model, int range_from, int range_to, String location, String unit, String type, String description) {
        Name = name;
        Model = model;
        Range_from = range_from;
        Range_to = range_to;
        Location = location;
        Unit = unit;
        Type = type;
        Description = description;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getRange_from() {
        return Range_from;
    }

    public Probe(){}



    public void setRange_from(int range_from) {
        Range_from = range_from;
    }

    public int getRange_to() {
        return Range_to;
    }

    public void setRange_to(int range_to) {
        Range_to = range_to;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
