package com.claim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.sql.Date;
import com.claim.entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,String>{

	//@Query("Select V FROM Vehicle V")
	//List<Vehicle> getVehicles();
	
	//TODO search for a type "model" of vehicle from the inventory link to controller
	// need to modify to a LIKE or REGEX query
	@Query("Select V FROM Vehicle V WHERE V.model = ?1")
	List<Vehicle> getVehiclesByModel(String model);

	@Query("SELECT V FROM Vehicle V WHERE V.dopDealer < 2021-12-30")
	List<Vehicle> findAllIdle();
	
	
}
