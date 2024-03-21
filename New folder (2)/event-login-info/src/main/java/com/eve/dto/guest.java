package com.eve.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;


@Entity
@Component
public class guest {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int e_id;
	private String eve_name;
	private String cityname;
	private double logitude;
	private double latitude;
	@OneToMany
	 List<entry>entry;
	
	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getEve_name() {
		return eve_name;
	}

	public void setEve_name(String eve_name) {
		this.eve_name = eve_name;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public double getLogitude() {
		return logitude;
	}

	public void setLogitude(double logitude) {
		this.logitude = logitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public List<entry> getAttendances() {
		return entry;
	}

	public void setAttendances(guest guest) {
		this.entry = entry;

		
		
	}

	public void saveAttendance(com.eve.dto.entry entry2) {
		// TODO Auto-generated method stub
		
	}

	
	}


	