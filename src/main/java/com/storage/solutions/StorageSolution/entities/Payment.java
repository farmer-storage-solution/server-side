package com.storage.solutions.StorageSolution.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Payment {
	
	private Long payemntId;
	private Recipt recipt;
	private Float rent;
	private Float workerSalary;
	private Float insurance;
	private Float sgst;
	private Float cgst;
	private Float Postage; //Stamp
	private Float totalAmount;
	private Date paymentDate;
	private String modeOfPayment;
	private String chequeNumber;
	
	public Payment() {
		super();
	}
	
	

	public Payment(Long payemntId, Recipt recipt, Float rent, Float workerSalary, Float insurance, Float sgst,
			Float cgst, Float postage, Float totalAmount, Date paymentDate, String modeOfPayment, String chequeNumber) {
		super();
		this.payemntId = payemntId;
		this.recipt = recipt;
		this.rent = rent;
		this.workerSalary = workerSalary;
		this.insurance = insurance;
		this.sgst = sgst;
		this.cgst = cgst;
		Postage = postage;
		this.totalAmount = totalAmount;
		this.paymentDate = paymentDate;
		this.modeOfPayment = modeOfPayment;
		this.chequeNumber = chequeNumber;
	}



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getPayemntId() {
		return payemntId;
	}
	public void setPayemntId(Long payemntId) {
		this.payemntId = payemntId;
	}
	
	
	public Recipt getRecipt() {
		return recipt;
	}
	public void setRecipt(Recipt recipt) {
		this.recipt = recipt;
	}
	
	@Column(length=8)
	public Float getRent() {
		return rent;
	}
	public void setRent(Float rent) {
		this.rent = rent;
	}
	
	@Column(length=8)
	public Float getWorkerSalary() {
		return workerSalary;
	}
	public void setWorkerSalary(Float workerSalary) {
		this.workerSalary = workerSalary;
	}
	
	@Column(length=8)
	public Float getInsurance() {
		return insurance;
	}
	public void setInsurance(Float insurance) {
		this.insurance = insurance;
	}
	
	@Column(length=8)
	public Float getSgst() {
		return sgst;
	}
	public void setSgst(Float sgst) {
		this.sgst = sgst;
	}
	
	@Column(length=8)
	public Float getCgst() {
		return cgst;
	}
	public void setCgst(Float cgst) {
		this.cgst = cgst;
	}
	
	@Column(length=3)
	public Float getPostage() {
		return Postage;
	}
	public void setPostage(Float postage) {
		Postage = postage;
	}
	
	@Column(length=10)
	public Float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}


	@Column(length=20)
	public String getModeOfPayment() {
		return modeOfPayment;
	}



	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}


	@Column(length=30)
	public String getChequeNumber() {
		return chequeNumber;
	}



	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	
	
	
}
