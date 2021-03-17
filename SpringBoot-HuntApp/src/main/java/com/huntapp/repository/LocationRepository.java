package com.huntapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.huntapp.models.AddLocation;

@Repository
public interface LocationRepository extends JpaRepository<AddLocation, Integer>{

}
