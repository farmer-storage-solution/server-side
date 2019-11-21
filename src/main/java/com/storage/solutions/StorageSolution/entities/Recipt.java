package com.storage.solutions.StorageSolution.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Columns;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Recipt {
	
	private Long reciptNumber;
	private Long phoneNumber;
	private Farmer farmer;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	private Inventory inventory;
	private Integer count;
	private String vehicalNumber;
	private MasterData masterData;
	private String reciptType;
	
	
	public Recipt() {
		super();
	}
	
	
	public Recipt(Long reciptNumber, Long phoneNumber, Farmer farmer, Date date, Inventory inventory, Integer count,
			String vehicalNumber, MasterData masterData, String reciptType) {
		super();
		this.reciptNumber = reciptNumber;
		this.phoneNumber = phoneNumber;
		this.farmer = farmer;
		this.date = date;
		this.inventory = inventory;
		this.count = count;
		this.vehicalNumber = vehicalNumber;
		this.masterData = masterData;
		this.reciptType = reciptType;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getReciptNumber() {
		return reciptNumber;
	}
	public void setReciptNumber(Long reciptNumber) {
		this.reciptNumber = reciptNumber;
	}
	
	@Column(length=13)
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Farmer getFarmer() {
		return farmer;
	}
	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}
	@Temporal(TemporalType.DATE)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	@Column(length=6)
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	@Column(length=12)
	public String getVehicalNumber() {
		return vehicalNumber;
	}
	public void setVehicalNumber(String vehicalNumber) {
		this.vehicalNumber = vehicalNumber;
	}
	
	public MasterData getMasterData() {
		return masterData;
	}
	public void setMasterData(MasterData masterData) {
		this.masterData = masterData;
	}
	@Column(length=20)
	public String getReciptType() {
		return reciptType;
	}
	public void setReciptType(String reciptType) {
		this.reciptType = reciptType;
	}

	
}
