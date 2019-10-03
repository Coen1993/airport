package com.example.vliegveld.service;

import com.example.vliegveld.model.Plane;
import com.example.vliegveld.repository.PlaneRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaneService {

    @Autowired
    private PlaneRepository planeRepository;

    public Iterable<Plane> getPlane(){
        Iterable<Plane> planes = this.planeRepository.findAll();
        return planes;
    }

    public Plane add(Plane plane) {
        return this.planeRepository.save(plane);
    }
}
