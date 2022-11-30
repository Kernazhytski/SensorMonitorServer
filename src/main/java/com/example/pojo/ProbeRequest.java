package com.example.pojo;

public class ProbeRequest {
    private String name;
    private String model;
    private String type;
    private int range_from;
    private int range_to;
    private String unit;
    private String location;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRange_from() {
        return range_from;
    }

    public void setRange_from(int range_from) {
        this.range_from = range_from;
    }

    public int getRange_to() {
        return range_to;
    }

    public void setRange_to(int range_to) {
        this.range_to = range_to;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
