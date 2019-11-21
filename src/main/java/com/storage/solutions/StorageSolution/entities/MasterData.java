package com.storage.solutions.StorageSolution.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MasterData {
	
	private String storageNumber;
	private String storageName;
	private String gstNumber;
	private Float sgst;
	private Float cgst;
	private Float insurancePricePerBox;
	private Float workersSalaryPricePerBox;
	private Float postagePrice;
	private String addressOfStorage;
	private String phoneNumber;
	private Integer totalStorageCapacity;
	private Location location;
	
	public MasterData()
	{
		super();
	}
	
	public MasterData(String storageNumber, String storageName, String gstNumber, Float sgst, Float cgst,
			Float insurancePricePerBox, Float workersSalaryPricePerBox, Float postagePrice, String addressOfStorage,
			String phoneNumber, Integer totalStorageCapacity, Location location) {
		super();
		this.storageNumber = storageNumber;
		this.storageName = storageName;
		this.gstNumber = gstNumber;
		this.sgst = sgst;
		this.cgst = cgst;
		this.insurancePricePerBox = insurancePricePerBox;
		this.workersSalaryPricePerBox = workersSalaryPricePerBox;
		this.postagePrice = postagePrice;
		this.addressOfStorage = addressOfStorage;
		this.phoneNumber = phoneNumber;
		this.totalStorageCapacity = totalStorageCapacity;
		this.location = location;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public String getStorageNumber() {
		return storageNumber;
	}
	public void setStorageNumber(String storageNumber) {
		this.storageNumber = storageNumber;
	}
	
	@Column(length=50)
	public String getStorageName() {
		return storageName;
	}
	public void setStorageName(String storageName) {
		this.storageName = storageName;
	}
	
	@Column(length=20)
	public String getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}
	
	@Column(length=5)
	public Float getSgst() {
		return sgst;
	}
	public void setSgst(Float sgst) {
		this.sgst = sgst;
	}
	@Column(length=5)
	public Float getCgst() {
		return cgst;
	}
	public void setCgst(Float cgst) {
		this.cgst = cgst;
	}
	@Column(length=4)
	public Float getInsurancePricePerBox() {
		return insurancePricePerBox;
	}
	public void setInsurancePricePerBox(Float insurancePricePerBox) {
		this.insurancePricePerBox = insurancePricePerBox;
	}
	@Column(length=4)
	public Float getWorkersSalaryPricePerBox() {
		return workersSalaryPricePerBox;
	}
	public void setWorkersSalaryPricePerBox(Float workersSalaryPricePerBox) {
		this.workersSalaryPricePerBox = workersSalaryPricePerBox;
	}
	@Column(length=3)
	public Float getPostagePrice() {
		return postagePrice;
	}
	public void setPostagePrice(Float postagePrice) {
		this.postagePrice = postagePrice;
	}
	@Column(length=80)
	public String getAddressOfStorage() {
		return addressOfStorage;
	}
	public void setAddressOfStorage(String addressOfStorage) {
		this.addressOfStorage = addressOfStorage;
	}
	@Column(length=13)
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Integer getTotalStorageCapacity() {
		return totalStorageCapacity;
	}
	public void setTotalStorageCapacity(Integer totalStorageCapacity) {
		this.totalStorageCapacity = totalStorageCapacity;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "MasterData [storageNumber=" + storageNumber + ", storageName=" + storageName + ", gstNumber="
				+ gstNumber + ", sgst=" + sgst + ", cgst=" + cgst + ", insurancePricePerBox=" + insurancePricePerBox
				+ ", workersSalaryPricePerBox=" + workersSalaryPricePerBox + ", postagePrice=" + postagePrice
				+ ", addressOfStorage=" + addressOfStorage + ", phoneNumber=" + phoneNumber + ", totalStorageCapacity="
				+ totalStorageCapacity + ", location=" + location + "]";
	}
	
	
	
	
}
