package com.storage.solutions.StorageSolution.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Outbound")
public class Outbound extends Recipt {
	
	private Long inboundReciptNumber;
	private String paymentId;
	private String shera; // for weight
	private String rentedStorageTime;
	
	public Outbound() {
		super();
	}

	public Outbound(Long inboundReciptNumber, String paymentId, String shera, String rentedStorageTime) {
		super();
		this.inboundReciptNumber = inboundReciptNumber;
		this.paymentId = paymentId;
		this.shera = shera;
		this.rentedStorageTime = rentedStorageTime;
	}

	public Outbound(Long reciptNumber, Long phoneNumber, Farmer farmer, Date date, Inventory inventory, Integer count,
			String vehicalNumber, MasterData masterData, String reciptType, Long inboundReciptNumber, String paymentId,
			String shera, String rentedStorageTime) {
		super(reciptNumber, phoneNumber, farmer, date, inventory, count, vehicalNumber, masterData, reciptType);
		this.inboundReciptNumber = inboundReciptNumber;
		this.paymentId = paymentId;
		this.shera = shera;
		this.rentedStorageTime = rentedStorageTime;
	}

	
	public Long getInboundReciptNumber() {
		return inboundReciptNumber;
	}

	public void setInboundReciptNumber(Long inboundReciptNumber) {
		this.inboundReciptNumber = inboundReciptNumber;
	}

	
	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	@Column(length=30)
	public String getShera() {
		return shera;
	}

	public void setShera(String shera) {
		this.shera = shera;
	}

	@Column(length=40)
	public String getRentedStorageTime() {
		return rentedStorageTime;
	}

	public void setRentedStorageTime(String rentedStorageTime) {
		this.rentedStorageTime = rentedStorageTime;
	}

	@Override
	public String toString() {
		return "Outbound [inboundReciptNumber=" + inboundReciptNumber + ", paymentId=" + paymentId + ", shera=" + shera
				+ ", rentedStorageTime=" + rentedStorageTime + "]";
	}
	
	
	
	
}

