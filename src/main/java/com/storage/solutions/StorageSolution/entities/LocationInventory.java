package com.storage.solutions.StorageSolution.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Columns;

@Entity
public class LocationInventory {
	
	private Long locationInventoryId;
	private String floor;
	private String chember;
	private String locationInChember;
	public LocationInventory() {
		super();
	}
	public LocationInventory(Long locationInventoryId, String floor, String chember,
			String locationInChember) {
		super();
		this.locationInventoryId = locationInventoryId;
		this.floor = floor;
		this.chember = chember;
		this.locationInChember = locationInChember;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getLocationInventoryId() {
		return locationInventoryId;
	}
	public void setLocationInventoryId(Long locationInventoryId) {
		this.locationInventoryId = locationInventoryId;
	}
	@Column(length=20)
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	@Column(length=3)
	public String getChember() {
		return chember;
	}
	public void setChember(String chember) {
		this.chember = chember;
	}
	@Column(length=6)
	public String getLocationInChember() {
		return locationInChember;
	}
	public void setLocationInChember(String locationInChember) {
		this.locationInChember = locationInChember;
	}
	@Override
	public String toString() {
		return "LocationInventory [locationInventoryId=" + locationInventoryId + ", floor=" + floor + ", chember="
				+ chember + ", locationInChember=" + locationInChember + "]";
	}
	
	
}
