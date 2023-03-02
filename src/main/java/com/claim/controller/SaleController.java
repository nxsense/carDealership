package com.claim.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Sale;
import com.claim.service.SaleService;

@Controller
public class SaleController {

	//dependency injection
	SaleService saleService;

	@GetMapping("/makeBid")
	public ModelAndView displayBidForm(Model model) {
		return new ModelAndView("makeBid", "sale", new Sale());
	}

	@PostMapping("/makeBid")
	public String handleMakeBid(Model model, @ModelAttribute("sale") Sale bid, HttpSession session) {
		System.out.println("I'm attempting to make a bid");
		return "bid-success";
	}
	
}
