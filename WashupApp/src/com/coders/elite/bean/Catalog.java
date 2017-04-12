package com.coders.elite.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;


@Entity
@Table(name="CATALOG") @Proxy (lazy = false)
public class Catalog {

	@Id
	@Column
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer catalog_id;
	
	@Column
	private String name;
	
	@Column
	private String rate;
	
	@Column
	private String category;
	
	

	public Catalog() {
		super();
	}
	

	public Catalog(Integer catalog_id, String name, String rate, String category) {
		super();
		this.catalog_id = catalog_id;
		this.name = name;
		this.rate = rate;
		this.category = category;
	}


	public Integer getCatalog_id() {
		return catalog_id;
	}

	public void setCatalog_id(Integer catalog_id) {
		this.catalog_id = catalog_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
}
