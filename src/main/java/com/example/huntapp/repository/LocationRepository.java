package com.example.huntapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.huntapp.entity.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {

}
