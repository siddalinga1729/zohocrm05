package com.zohocrm5.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohocrm5.entities.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
//inheritance is happening
}
