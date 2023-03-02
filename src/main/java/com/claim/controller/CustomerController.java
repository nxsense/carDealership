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
import com.claim.entity.Vehicle;
import com.claim.service.CustomerService;


@Controller
public class CustomerController {

	//dependency injection
		@Autowired
		CustomerService customerService;
		@GetMapping("/saveCustomer")
		public ModelAndView addNewCustomer(Model model) {
			System.out.println("getmapping add new CUSTOMER fired");
			return new ModelAndView("saveCustomer", "customer", new Customer());
		}

		@PostMapping("/saveCustomer")
		public String handleAddNewCustomer(Model model, @ModelAttribute("customer") Customer customer, HttpSession session) {
			System.out.println("postmapping add new customer fired");
			model.addAttribute("newCustomer", customer);
			customerService.saveCustomer(customer);

			return "thank-you";
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
