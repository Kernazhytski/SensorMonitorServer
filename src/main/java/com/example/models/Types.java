package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Types {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String type_of_probes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType_of_probes() {
        return type_of_probes;
    }

    public void setType_of_probes(String type) {
        this.type_of_probes = type;
    }

    public Types(){}
}
