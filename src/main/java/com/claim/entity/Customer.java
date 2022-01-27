package com.claim.entity;

import java.util.Date;
import javax.persistence.*;

/*
 * CREATE TABLE customer (
customer_id int NOT NULL AUTO_INCREMENT,
vin VARCHAR(40),
dop_buyer DATE,
purchase_price DOUBLE,
first_name VARCHAR(30),
last_name VARCHAR(30),
phone_number VARCHAR(15),
PRIMARY KEY (customer_id),
FOREIGN KEY (vin) REFERENCES vehicle(vin)
);
 */

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "vin")
	private String vehicleId;
	
	@Column(name = "dop_buyer")
	private Date dopBuyer;
	
	@Column(name = "purchase_price")
	private double purchasePrice;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "phone_number")
	private String phoneNumber;

	
	public Customer() {
		
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Date getDopBuyer() {
		return dopBuyer;
	}

	public void setDopBuyer(Date dopBuyer) {
		this.dopBuyer = dopBuyer;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
