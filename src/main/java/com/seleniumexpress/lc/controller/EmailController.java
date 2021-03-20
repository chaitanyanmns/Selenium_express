package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.EmailDTO;

@Controller
public class EmailController {
	
	@RequestMapping("/sendEmail/{userName}")
	public String sendEmail(@PathVariable String userName,Model model) {
		System.out.println("inside sendEmail");
		System.out.println("usernamemm:"+userName);
		model.addAttribute("userName", userName);
		model.addAttribute("emailDTO", new EmailDTO());
		
		
		return "send-email-page";
		
	}
	
	@RequestMapping("/process-email")
	public String processEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO) {
		System.out.println("inside processEmail");
		return "process-email-page";
		
	}

}
