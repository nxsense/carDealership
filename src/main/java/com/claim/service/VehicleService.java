package com.claim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Vehicle;
import com.claim.repository.VehicleRepository;

@Service
public class VehicleService {
	
	//dependency injection
	@Autowired
	VehicleRepository vehicleRepository;
	
	public void saveVehicle(Vehicle vehicle) {
		vehicleRepository.save(vehicle);
		//links to /addVehicle form
	}
	
	
	public List<Vehicle> getVehicles(){
		return vehicleRepository.findAll();
	}
	
	//TODO displayAllVehicles >120 days idle time
	//create this query/method in VehicleRepository Class
	public List<Vehicle> getIdleVehicles(){
		return vehicleRepository.findAllIdle();
	}

	public List<Vehicle> getVehiclesByModel(String modelType) {
		// TODO Auto-generated method stub
		System.out.println("I'm searching for a " + modelType);
		return vehicleRepository.getVehiclesByModel(modelType);
	}
	
	public Vehicle getVehicleById(String vin) {
		//TODO add query in vehicleRepository
		return vehicleRepository.findById(vin).get();
	}
}
