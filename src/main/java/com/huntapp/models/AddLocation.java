package com.huntapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.Bean;
public class AddLocation {

	@Entity
	public class Locations {
		
		@Id
		private int Id;
		private double lat;
		private double lon;
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public double getLat() {
			return lat;
		}
		public void setLat(double lat) {
			this.lat = lat;
		}
		public double getLon() {
			return lon;
		}
		public void setLon(double lon) {
			this.lon = lon;
		}
		@Override
		public String toString() {
			return "Locations [Id=" + Id + ", lat=" + lat + ", lon=" + lon + "]";
		}
		
		
	}
}
