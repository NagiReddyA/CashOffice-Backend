package com.sais.cashoffice.CashOfficeTest.cashofficeReports.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.cashofficeReports.entities.CORReceiptListing;
import com.sais.cashoffice.CashOfficeTest.cashofficeReports.repository.CORReceiptListingRepository;

@CrossOrigin(origins = {"http://localhost:4200", "*"} , allowedHeaders = "*")
@RestController
@RequestMapping("/api/cor_receipt-listing")
public class CORReceiptListingController {
	
	@Autowired
	CORReceiptListingRepository receiptListingRepos ;
	
	@GetMapping("/{receipt_date}&{cash_office_id}&{branch_code}&{cashier_code}")
	public List<CORReceiptListing> getListing(
			@PathVariable("receipt_date") String receipt_date,
			@PathVariable("cash_office_id") String cash_office_id,
			@PathVariable("branch_code") String branch_code,
			@PathVariable("cashier_code") String cashier_code 
			){
		return receiptListingRepos.getReceiptListing(receipt_date, cash_office_id, branch_code, cashier_code) ;  
	}
	
	@GetMapping("/error")
	public String errorListing()
	{
		return "There's an error somewhere... -dbg." ;
	}
}

