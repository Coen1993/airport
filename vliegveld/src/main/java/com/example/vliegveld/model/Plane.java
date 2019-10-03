package com.example.vliegveld.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plane {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String planeIdentification;
    private String planeType;

    public Plane() {
    }

    public Plane(String planeIdentification, String planeType) {
        this.planeIdentification = planeIdentification;
        this.planeType = planeType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlaneIdentification() {
        return planeIdentification;
    }

    public void setPlaneIdentification(String planeIdentification) {
        this.planeIdentification = planeIdentification;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }
}
