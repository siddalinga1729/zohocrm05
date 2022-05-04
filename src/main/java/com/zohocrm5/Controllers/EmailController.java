package com.zohocrm5.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm5.utility.EmailServices;

@Controller
public class EmailController {

	@Autowired
	private EmailServices emailService;
	@RequestMapping("compose")
	public String composeEmail(@RequestParam("emailid")String emailid,ModelMap model) {
		model.addAttribute("emailid", emailid);
		return "compose_email";
	}
	@RequestMapping("sendemail")
	public String senEmail(@RequestParam("to")String to,@RequestParam("subject")String subject,@RequestParam("text")String text) {
		emailService.sendSimpleMessage(to, subject, text);
		return "compose_email";
	}
	
}
