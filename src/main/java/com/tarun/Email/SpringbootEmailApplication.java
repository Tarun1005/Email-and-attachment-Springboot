package com.tarun.Email;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.tarun.Email.service.MailService;

@SpringBootApplication
public class SpringbootEmailApplication {


	@Autowired
	private MailService mailService;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEmailApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
	mailService.sendMail2("Tarunankam05@gmail.com", "Spring","Hello");

	mailService.sendMailWithAttachment("Tarunankam05@gmail.com", "Spring","Hello","E:\\courses\\SpringNotes.docx" );



	}

}
