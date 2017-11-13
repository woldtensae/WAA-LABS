package edu.mum.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import edu.mum.domain.Employee;
import mum.edu.exception.NoFileUploadedException;

@Controller
public class EmployeeController {
	@Autowired
	ServletContext servletContext;
	

	private static final Log logger = LogFactory.getLog(EmployeeController.class);

	@RequestMapping(value = { "/", "employee_input" })
	public String inputEmployee(@ModelAttribute("employee") Employee employee, Locale locale) {
		logger.info(locale);
		return "EmployeeForm";
	}

	@RequestMapping(value = "/employee_save")
	public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult,
			Model model, HttpServletRequest request) throws FileNotFoundException {

		if (bindingResult.hasErrors()) {
			return "EmployeeForm";
		}
		
		MultipartFile employeeImage = employee.getEmployeePhoto();
		
		String rootDirectory = servletContext.getRealPath("/");
		
		if (employeeImage == null && employeeImage.isEmpty()) {
			throw new NoFileUploadedException("employee Image saving failed");
		}
			
			try {
			employeeImage.transferTo(
				new File(rootDirectory + "resources\\images\\" + employee.getId() +".png"));
			} catch (Exception e) {
				throw new NoFileUploadedException("employee Image saving failed");
			}

		String[] suppressedFields = bindingResult.getSuppressedFields();
		if (suppressedFields.length > 0) {
			throw new RuntimeException("Attempt to bind fields that haven't been allowed in initBinder(): "
					+ StringUtils.addStringToArray(suppressedFields, ", "));
		}

		// save product here
		model.addAttribute("employee", employee);

		return "EmployeeDetails";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// binder.setDisallowedFields(new String[]{"firstName"});
	}
	
	@ExceptionHandler(NoFileUploadedException.class) 
	public ModelAndView handleError(HttpServletRequest req, NoFileUploadedException exception) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", exception.getMessage());
		mav.addObject("exception", exception);
		mav.addObject("url", req.getRequestURL());
		mav.setViewName("noFileFound");
		return mav;
	}

}
