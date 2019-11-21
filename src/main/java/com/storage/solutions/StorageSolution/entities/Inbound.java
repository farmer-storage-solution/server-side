package com.storage.solutions.StorageSolution.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Inbound")
public class Inbound extends Recipt {
	
	private String shera;

	public Inbound(String shera) {
		super();
		this.shera = shera;
	}

	
	public Inbound() {
		super();
	}



	public Inbound(Long reciptNumber, Long phoneNumber, Farmer farmer, Date date, Inventory inventory, Integer count,
			String vehicalNumber, MasterData masterData, String reciptType, String shera) {
		super(reciptNumber, phoneNumber, farmer, date, inventory, count, vehicalNumber, masterData, reciptType);
		this.shera = shera;
	}


	@Column(length=20)
	public String getShera() {
		return shera;
	}


	public void setShera(String shera) {
		this.shera = shera;
	}
	
	
	
}
