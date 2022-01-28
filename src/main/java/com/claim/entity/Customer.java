package com.claim.entity;

import java.util.Date;
import java.util.Optional;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.claim.entity.Vehicle;
import com.claim.repository.VehicleRepository;
import com.claim.service.*;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name = "customer_id")
	private int customerId;
	
	//@OneToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name = "vin")
	//private Vehicle vehicle;
	
	@Column(name = "vin")
	private static String vehicleId;
	
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

	//dependency injection
	//	@Autowired
	//	VehicleRepository vehicleRepository;
	
	public Customer() {
		
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public static String getVehicleId() {
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
	
//	public Optional<Vehicle> getCustomerVehicle() {
//		return vehicleRepository.findById(Customer.getVehicleId());
//	}
	
}
