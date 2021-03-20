package com.seleniumexpress.lc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.Validator.EmailValidator;
import com.seleniumexpress.lc.Validator.UserNameValidator;
import com.seleniumexpress.lc.api.CommunicationDTO;
import com.seleniumexpress.lc.api.Phone;
import com.seleniumexpress.lc.api.UserRegistrationDTO;
import com.seleniumexpress.lc.propertyeditor.NamePropertyEditor;

@Controller
public class RegistrationController {
	
	@Autowired
	private EmailValidator emailValidator;
	
	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO dto) {

		System.out.println("inside showRegistrationPage method");
		
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("4334535345");
		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);
		dto.setCommunicationDTO(communicationDTO);
		
		return "user-registration-page";
	}
	
	@RequestMapping("/registration-success")
	public String ProcessUserReg(@Valid @ModelAttribute("userReg") UserRegistrationDTO dto, BindingResult bindingResult) {
		
		System.out.println("inside ProcessUserReg method");
		System.out.println("Name value entered by user is: |"+dto.getName()+"|");
		
		//add the validator manually
		//EmailValidator emailValidator = new EmailValidator();
		emailValidator.validate(dto, bindingResult);
		
		if(bindingResult.hasErrors())
		{
			List<ObjectError> allErrors =bindingResult.getAllErrors();
			for(ObjectError error : allErrors)
			{
				System.out.println(error);
			}
			
			return "user-registration-page";
		}
		
		return "registration-success";
		
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("inside the init Binder method..!");
		//binder.setDisallowedFields("name");
		StringTrimmerEditor editor = new StringTrimmerEditor(false);
		binder.registerCustomEditor(String.class, "name", editor);
		
		NamePropertyEditor nameEditor = new NamePropertyEditor();
	    binder.registerCustomEditor(String.class,"name", nameEditor);
	    
	    //register the UserNameValidator validtor in initbinder
	    binder.addValidators(new UserNameValidator());
	    //binder.addValidators(new EmailValidator());
		
	}

}
