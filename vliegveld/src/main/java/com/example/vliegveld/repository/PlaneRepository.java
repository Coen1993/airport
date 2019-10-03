package com.example.vliegveld.repository;

import com.example.vliegveld.model.Plane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepository extends CrudRepository<Plane, Long> {

}
