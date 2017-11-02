package edu.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController {
	@RequestMapping(value= {"/", "/calculator"})
	public String getCalculator() {
		return "calculatorForm";
	}
	
	
}
