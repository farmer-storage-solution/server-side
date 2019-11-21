package com.storage.solutions.StorageSolution.entities;

import javax.persistence.Entity;

@Entity
public class Location {

    private Integer floor;
    private String chembers;
    private String locaionInChember;
    
    public Location()
    {
    	super();
    }
    
    
	public Location(Integer floor, String chembers, String locaionInChember) {
		super();
		this.floor = floor;
		this.chembers = chembers;
		this.locaionInChember = locaionInChember;
	}



	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	public String getChembers() {
		return chembers;
	}
	public void setChembers(String chembers) {
		this.chembers = chembers;
	}
	public String getLocaionInChember() {
		return locaionInChember;
	}
	public void setLocaionInChember(String locaionInChember) {
		this.locaionInChember = locaionInChember;
	}
	@Override
	public String toString() {
		return "Location [floor=" + floor + ", chembers=" + chembers + ", locaionInChember=" + locaionInChember + "]";
	}

    

}
