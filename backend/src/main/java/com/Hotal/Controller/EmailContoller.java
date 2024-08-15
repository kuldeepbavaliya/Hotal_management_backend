package com.Hotal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hotal.Service.EmailService;

@RestController
@RequestMapping("/email")
@CrossOrigin
public class EmailContoller {

	@Autowired
	EmailService emails;
	
	@GetMapping("/go/{to}&&{subject}&&{text}")
	public String addemail(@PathVariable String to,@PathVariable String subject,@PathVariable String text)
	{
		return emails.sendEmail(to,subject,text);
	}
	
	
}
