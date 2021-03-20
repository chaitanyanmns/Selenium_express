package com.seleniumexpress.lc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.UserInfoDTO;

@Controller
public class LCAppController {
	
	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		System.out.println("coming inside home-page");
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result  ) {
		
		System.out.println("coming inside /process-homepage");
		//if any errors
		System.out.println("Terms and conditions :"+userInfoDTO.isTermAndCondition());
		if(result.hasErrors()) {
			System.out.println("validation has errors");
			return "home-page";
		}
		
		//write a service which will calculate love
		
		
		return "result-page";
	}

}
