package com.example.vliegveld.controller;

import com.example.vliegveld.exceptions.NotFoundException;
import com.example.vliegveld.model.Plane;
import com.example.vliegveld.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/plane/")
public class PlaneController {

    @Autowired
    private PlaneService planeService;

    @GetMapping("randomplane")
    public Plane getRandomPlane() {
        Plane plane = new Plane("AB123", "Boeing");
        return plane;
    }

    @GetMapping("planes")
    public Iterable<Plane> getPlanes() {
        return this.planeService.getPlane();
    }

    @PostMapping("add")
    public Plane addPlane(@RequestBody Plane newPlane) throws NotFoundException {
        return this.planeService.add(newPlane);
    }
}
