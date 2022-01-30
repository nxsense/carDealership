package com.claim.entity;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name="sale")
public class Sale {

	@Id
	@Column(name="time_of_sale")
	private String timeOfSale;
	
	@Column(name="dop_buyer")
	private Date dopBuyer;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="isDiscounted")
	private boolean isDiscounted;
	
	//FK into table customer
	//relationship annotation
	@Column(name="customer_ID")
	private int custId;
	
	//FK into table vehicle
	//relationship annotation
	@Column(name="vehicle_ID")
	private String vehicleId;
	
	
	public Sale() {	}

	public String getTimeOfSale() {
		return timeOfSale;
	}

	public void setTimeOfSale(String timeOfSale) {
		this.timeOfSale = timeOfSale;
	}

	public Date getDopBuyer() {
		return dopBuyer;
	}

	public void setDopBuyer(Date dopBuyer) {
		this.dopBuyer = dopBuyer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isDiscounted() {
		return isDiscounted;
	}

	public void setDiscounted(boolean isDiscounted) {
		this.isDiscounted = isDiscounted;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	
	
}
