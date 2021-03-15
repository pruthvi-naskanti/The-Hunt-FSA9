package com.huntapp.repository;



import org.springframework.data.repository.CrudRepository;

import com.huntapp.models.AddLocation;

public interface LocationRepository extends CrudRepository<AddLocation, Integer>{

}
