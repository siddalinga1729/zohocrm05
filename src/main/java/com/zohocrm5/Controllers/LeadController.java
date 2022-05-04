package com.zohocrm5.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm5.Services.LeadServices;
import com.zohocrm5.entities.Lead;

@Controller
public class LeadController {
@Autowired
	private LeadServices leadServices;//class upcasting
	@RequestMapping("/viewleadpage")
	public String viewLeadPage() {
		return "create_lead";
	}
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute() Lead lead,ModelMap model) {
		leadServices.saveLead(lead);
		model.addAttribute("lead", lead);
		return "view_lead";
	}
	@RequestMapping("listAllLeads")
	public String getAllLead(ModelMap model) {
		List<Lead> leads = leadServices.getAllLeads();
		model.addAttribute("leads", leads);
		return "ListAll_Lead";
	}
	@RequestMapping("getById")
	public String getById(@RequestParam("id") int id,ModelMap model) {
		Lead lead=leadServices.getById(id);
		model.addAttribute("lead", lead);
		return "view_lead";
	}
}
