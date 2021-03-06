package com.sais.cashoffice.CashOfficeTest.paypointReports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.UnspecifiedGso;
import com.sais.cashoffice.CashOfficeTest.paypointReports.repository.UnspecifiedGsoRepository;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/api/paypoint-reports/unspecified-gsoeso")
public class UnspecifiedGsoController {
	
	@Autowired
	UnspecifiedGsoRepository ugsoRepos ;
		
	@GetMapping("/{from_date}&{to_date}")
	public List<UnspecifiedGso> getUGsos(@PathVariable("from_date") String from_date, 
			@PathVariable("to_date") String to_date){ 
		
		System.out.println(); // dbg. 
		System.out.println("::: FROM " + from_date + " TO " + to_date ) ; // dbg. 
		System.out.println(); // dbg. 
		
		return ugsoRepos.getUnspecifiedGso(from_date, to_date) ; 
	}

}

