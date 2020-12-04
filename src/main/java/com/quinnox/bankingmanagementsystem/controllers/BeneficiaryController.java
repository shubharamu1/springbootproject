package com.quinnox.bankingmanagementsystem.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.bankingmanagementsystem.dao.BeneficiaryRepository;
import com.quinnox.bankingmanagementsystem.dto.ResponseData;
import com.quinnox.bankingmanagementsystem.entities.Beneficiary;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BeneficiaryController {
	
	@Autowired
	BeneficiaryRepository benRepo;
	
	@PostMapping("/beneficiary")
	public String addBeneficiery(@RequestBody Beneficiary beneficiary) {
		benRepo.save(beneficiary);
		return "Beneficiary Added Succefully";
	}
	
	@GetMapping("/beneficiaries")
	public ResponseData findAllBenefiaciary(){
		ResponseData response = new ResponseData();
		response.setMsg("beneficiary details Recived Successfully");
		response.setData(benRepo.findAll());
		return response;
		
	}
	@DeleteMapping("/beneficiary")
	public String deleteBeneficiary(int beneficiaryId) {
		benRepo.deleteById(beneficiaryId);
		return "Beneficiary deleted succesfully";	
	}
	@GetMapping("/beneficiary/BeneficiaryId")
	public Beneficiary findByBeneficiaryId(int beneficiaryId) {
		return benRepo.findByBeneficiaryId(beneficiaryId);
	}
	
	
	

}
