package com.seleniumexpress.lc.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

	private int lower;
	private int upper;
	
	@Override
	public void initialize(Age age) {
		System.out.println("AgeValidator - initialize");
		this.lower=age.lower();
		this.upper=age.upper();	

	}
	
		
	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {

		System.out.println("AgeValidator - isValid");
		if( age == null || age < lower || age > upper  )
		{
			return false;
		}
		return true;
	}
	
	

}
