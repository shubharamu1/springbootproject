package com.quinnox.bankingmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quinnox.bankingmanagementsystem.entities.News;

public interface NewsRepository extends JpaRepository<News, Integer>{

}
