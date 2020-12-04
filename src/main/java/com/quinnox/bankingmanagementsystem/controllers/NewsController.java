package com.quinnox.bankingmanagementsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.bankingmanagementsystem.dao.NewsRepository;
import com.quinnox.bankingmanagementsystem.dto.ResponseData;
import com.quinnox.bankingmanagementsystem.entities.News;

@RestController
@RequestMapping("news")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NewsController {

	@Autowired
	NewsRepository newsRepo;
	
	@PostMapping("/postnews")
	public String addNews(@RequestBody News news ) {
		newsRepo.save(news);
		return " News Added Succefully";
	}
	
	@GetMapping("/news")
	public ResponseData findAll() {
		ResponseData response = new ResponseData();
		response.setMsg("News Recived Successfully");
		response.setData(newsRepo.findAll());
		return response;
	
	}
	
	
	
}
