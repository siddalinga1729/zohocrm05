package com.zohocrm5.utility;

import org.springframework.stereotype.Service;

@Service
public interface EmailServices {
	 public void sendSimpleMessage(String to, String subject, String text);
}
