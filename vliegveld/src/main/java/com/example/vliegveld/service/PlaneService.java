package com.example.vliegveld.service;

import com.example.vliegveld.exceptions.NotFoundException;
import com.example.vliegveld.model.Plane;
import com.example.vliegveld.repository.PlaneRepository;
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

    public Plane add(Plane plane) throws NotFoundException {
        if(plane.getPlaneIdentification() == null) {
            throw new NotFoundException();
        }
        return this.planeRepository.save(plane);
    }
}
