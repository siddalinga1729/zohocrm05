package com.zohocrm5.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zohocrm5.entities.Contact;

@Service
public interface ContactServices {
public void saveContact(Contact contact);//here abstraction is happening

public List<Contact> getAllContacts();

public Contact getById(int id);

}
