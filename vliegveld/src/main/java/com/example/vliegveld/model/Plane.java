package com.example.vliegveld.model;


import javax.persistence.Entity;

@Entity
public class Plane {
    private long id;
    private String planeIdentification;
    private String planeType;

    public Plane(long id, String planeIdentification, String planeType) {
        this.id = id;
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
