package com.quinnox.bankingmanagementsystem.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="news")
public class News {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer newsId;
	
	@Column(name="heading")
	private String heading;
	
	@Column(name="subheading")
	private String subheading;
	
	@Column(name="content")
	private String content;

}
