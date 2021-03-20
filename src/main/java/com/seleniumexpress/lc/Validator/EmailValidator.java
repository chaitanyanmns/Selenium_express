package com.seleniumexpress.lc.Validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.seleniumexpress.lc.api.UserRegistrationDTO;

@Component
public class EmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDTO.email", "email.empty");
		
		String email = ((UserRegistrationDTO)object).getCommunicationDTO().getEmail();
		
		if(!email.endsWith("seleniumexpress.com"))
		{
			errors.rejectValue("communicationDTO.email", "email.invalidDomain");
		}
				
	}

}
