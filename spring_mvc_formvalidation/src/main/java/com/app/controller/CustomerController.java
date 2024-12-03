package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entity.Customer;

import jakarta.validation.Valid;

@Controller
@RequestMapping("customer")
public class CustomerController {
	@GetMapping("/show")
	public String customerForm(Model theModel) {
		//Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}

	@PostMapping("/savecustomer")
	public String saveCustomer(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult bindingResult) {
		System.out.println(bindingResult.getFieldError());
		if (bindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-details";
		}

	}

}
