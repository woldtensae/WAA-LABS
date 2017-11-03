package edu.mum.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.mum.service.RoastService;

@Controller
public class AdiviceController {
	@Autowired
	RoastService roastService;
	
	@RequestMapping("/advice")
	public String getAdvice(Model model) {
		Set<String> roasts = roastService.getAllRoasts();
		model.addAttribute("roasts", roasts);
		return "advice";
	}
	@RequestMapping(value = {"/advice"}, method = RequestMethod.POST)
	public String getRoasted(@RequestParam String roast, Model model){
		List<String> roastList = roastService.getAdviceByRoast(roast);
		model.addAttribute("roastList", roastList);
		return "display";
	}
}
