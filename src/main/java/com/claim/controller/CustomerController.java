package com.claim.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Customer;
import com.claim.service.CustomerService;


@Controller
public class CustomerController {

	//dependency injection
		@Autowired
		CustomerService customerService;
		/*
		 * //TODO	
		 * 
		 */
		@GetMapping("/saveCustomer")
		public String welcome(Model model) {
			return "thank-you";
		}
		
		@GetMapping("/transactions")
		public String handlePurchased(Model model)	{
		//	List<Vehicle> vehicles = vehicleService.findAll();
		//	model.addAttribute("vehicles", vehicles);
			return " ";
		}
		
		/*
		 * When user tries to purchase or bid on a vehicle this servlet
		 * will handle the request and add a Spring ModelAttribute object 
		 * to map to the new customer form called "newCustomer", which is 
		 * a Customer object.
		 */
		@GetMapping("/newCustomer")
		public ModelAndView CreateNewCustomer(Model model) {
			return new ModelAndView("newCustomer", "customer", new Customer());
		}
		
		@PostMapping("/newCustomer")
		public String registerCustomer(Model model, @ModelAttribute Customer customer, HttpSession session) {
			return "thank-you";
		}
}
