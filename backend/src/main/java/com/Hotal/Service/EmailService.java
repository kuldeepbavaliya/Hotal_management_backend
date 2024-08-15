package com.Hotal.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender mailsender;
	
	public String sendEmail(String to,
							String subject,
							String text)
	{
		SimpleMailMessage message=new SimpleMailMessage();
		
		message.setFrom("kanudo679@gmail.com");
		message.setTo(to);
		message.setSubject(subject);
		message.setText(text);
		
		mailsender.send(message);
		
		return "Send Email";
	}
}
