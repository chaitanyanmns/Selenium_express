package com.seleniumexpress.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	
	@NotBlank(message = "*username should not be blank")
	@Size(min = 3,max = 15,message = "{username.size}")
	private String userName;
	@NotBlank(message = "*crushName should not be blank")
	@Size(min = 3,max = 15,message = "*crush name should have char between 3-15")
	private String crushName;
	@AssertTrue(message = "manadatory to check this box")
	private boolean termAndCondition;
	
	
	
	
	public UserInfoDTO() {
		System.out.println("spring itself creating the object for this UserInfoDTO class!! ");
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	public boolean isTermAndCondition() {
		return termAndCondition;
	}

	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}
	
	
	
	

}
