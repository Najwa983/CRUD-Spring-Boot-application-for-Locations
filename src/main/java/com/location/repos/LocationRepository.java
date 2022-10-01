package com.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
