package com.quinnox.bankingmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.quinnox.bankingmanagementsystem.entities.Beneficiary;

public interface BeneficiaryRepository extends JpaRepository<Beneficiary,Integer>{

	public Beneficiary findByBeneficiaryId(int beneficiaryId);

}
