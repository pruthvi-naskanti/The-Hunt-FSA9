
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.HuntApp.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author VenkataYashwanth Damera
 */
@Entity
public class Location {
    @Id
    private int Location_id;
    private String Locaton_name;
    private double Longitude;
    private double Latitude;
	public int getLocation_id() {
		return Location_id;
	}
	public void setLocation_id(int location_id) {
		Location_id = location_id;
	}
	public String getLocaton_name() {
		return Locaton_name;
	}
	public void setLocaton_name(String locaton_name) {
		Locaton_name = locaton_name;
	}
	public double getLongitude() {
		return Longitude;
	}
	public void setLongitude(double longitude) {
		Longitude = longitude;
	}
	public double getLatitude() {
		return Latitude;
	}
	public void setLatitude(double latitude) {
		Latitude = latitude;
	}
	@Override
	public String toString() {
		return "Location [Location_id=" + Location_id + ", Locaton_name=" + Locaton_name + ", Longitude=" + Longitude
				+ ", Latitude=" + Latitude + "]";
	}

     
    
}
