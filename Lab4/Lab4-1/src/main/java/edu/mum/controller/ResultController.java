package edu.mum.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.mum.domain.Calculator;



@Controller
public class ResultController {
	
	
	@RequestMapping(value = {"/result"}, method = RequestMethod.POST)
	public String getResult(@RequestParam String num1, @RequestParam String num2, @RequestParam String num3,
			@RequestParam String num4, Model model) {
		Calculator calculator = new Calculator();
		calculator.setResult1("" + (Double.parseDouble(num1) + Double.parseDouble(num1)));
		calculator.setResult2("" + (Double.parseDouble(num3) * Double.parseDouble(num4)));
		calculator.setNum1(num1);
		calculator.setNum2(num2);
		calculator.setNum3(num3);
		calculator.setNum4(num4);
		
		model.addAttribute("calculator", calculator);
		return "result";
	}
}
