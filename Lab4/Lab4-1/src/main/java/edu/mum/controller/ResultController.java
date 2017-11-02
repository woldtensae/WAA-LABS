package edu.mum.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mum.domain.Calculator;



@Controller
public class ResultController {
	
	
	@RequestMapping(value = {"/result"}, method = RequestMethod.POST)
	public String getResult( Calculator calculator, Model model,
			RedirectAttributes redirectAttributes) {
		calculator.setResult1("" + (Double.parseDouble(calculator.getNum1()) + Double.parseDouble(calculator.getNum2())));
		calculator.setResult2("" + (Double.parseDouble(calculator.getNum3()) * Double.parseDouble(calculator.getNum4())));
	
		redirectAttributes.addFlashAttribute(calculator);
		return "redirect:displayResult";
	}
	
	@RequestMapping(value= {"/displayResult"}, method = RequestMethod.GET)
	public String displayResult(Model model){
		return "result";
	}
}
