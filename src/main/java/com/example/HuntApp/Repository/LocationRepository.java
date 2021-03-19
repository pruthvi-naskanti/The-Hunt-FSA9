/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.HuntApp.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.HuntApp.Models.Location;

/**
 *
 * @author VenkataYashwanth Damera
 */
public interface LocationRepository extends CrudRepository<Location, Integer>{
    
}
