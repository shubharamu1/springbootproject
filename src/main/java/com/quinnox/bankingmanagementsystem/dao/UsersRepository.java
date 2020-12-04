package com.quinnox.bankingmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.quinnox.bankingmanagementsystem.entities.User;

public interface UsersRepository extends JpaRepository<User, Integer> {
	


}
