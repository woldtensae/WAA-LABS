package edu.mum.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import mum.edu.exception.NoFileUploadedException;

@ControllerAdvice
public class ControllerExceptionHandler {
	@ExceptionHandler(NoFileUploadedException.class) 
	public ModelAndView handleError(HttpServletRequest req, NoFileUploadedException exception) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", exception.getMessage());
		modelAndView.addObject("exception", exception);
		modelAndView.addObject("url", req.getRequestURL());
		modelAndView.setViewName("error");
		return modelAndView;
	}
}
