package com.seleniumexpress.lc.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.seleniumexpress.lc.api.UserRegistrationDTO;

public class UserNameValidator implements Validator {

	//check if UserNameValidator supports the given object
	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserRegistrationDTO.class.equals(clazz);
	}

	//we need to write the custom validation logic
	@Override
	public void validate(Object object, Errors errors) {

		//ValidationUtils is a sping validation api.
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "username.empty","Username  cant be empty");
		
		//username must contain _
		String userName = ((UserRegistrationDTO)object).getUserName();
		
		if(!userName.contains("_"))
		{
			errors.rejectValue("userName", "username.invalidString", "String must contains _");
		}
	}

}
