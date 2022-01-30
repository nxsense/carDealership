package com.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.claim.entity.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale,String>{

	
}
