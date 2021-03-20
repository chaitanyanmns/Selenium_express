package com.seleniumexpress.lc.api;

import java.util.Arrays;

import javax.validation.constraints.NotEmpty;

import com.seleniumexpress.lc.Validator.Age;

public class UserRegistrationDTO {
	
	@NotEmpty(message = "{String.notEmpty}")
	private String name;
	private String userName;
	private char[] password;
	private String countryName;
	private String[] hobbies;
	private String gender;
	
	@Age(lower=31 , upper =70)
	private Integer age;
	
	private CommunicationDTO communicationDTO;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}
	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}
	@Override
	public String toString() {
		return "UserRegistrationDTO [name=" + name + ", userName=" + userName + ", password="
				+ Arrays.toString(password) + ", countryName=" + countryName + ", hobbies=" + Arrays.toString(hobbies)
				+ ", gender=" + gender + "]";
	}
	
	
	

}
