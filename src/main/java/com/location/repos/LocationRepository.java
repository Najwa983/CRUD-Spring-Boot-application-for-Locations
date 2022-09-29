package com.location.repos;

import org.springframework.data.repository.CrudRepository;

import com.location.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
