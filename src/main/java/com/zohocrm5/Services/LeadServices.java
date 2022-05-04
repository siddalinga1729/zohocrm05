package com.zohocrm5.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zohocrm5.entities.Lead;

@Service
public interface LeadServices {
public void saveLead(Lead lead);//here abstraction is happening

public List<Lead> getAllLeads();

public Lead getById(int id);

public void deleteLead(int id);

}
