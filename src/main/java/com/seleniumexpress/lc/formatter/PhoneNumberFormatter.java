package com.seleniumexpress.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seleniumexpress.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		
		System.out.println("Inside the print method of phone number formatter");
		return phone.getCountryCode()+"-"+phone.getUserNumber() ;
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {

		System.out.println("inside the parse method of phone number formatter");

		Phone phone = new Phone();
		// split the string received from the user
		String[] phoneNumberArray = completePhoneNumber.split("-");
		
		int index = completePhoneNumber.indexOf("-");
		if ((index == -1) || (completePhoneNumber.startsWith("-")))
		{
			phone.setCountryCode("91");
			if((completePhoneNumber.startsWith("-")))
			{
				phone.setUserNumber(phoneNumberArray[1]);
			}
			else
			{
			phone.setUserNumber(phoneNumberArray[0]);
			}

		} else {

			phone.setCountryCode(phoneNumberArray[0]);
			phone.setUserNumber(phoneNumberArray[1]);
		}

		return phone;
	}

}
