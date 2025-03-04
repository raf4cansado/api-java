package com.firtsproject.firtsproject.entities;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String mome;
	private Double price;
	
	private Category category;
	
	public Product() {
		
	}

	public Product(long id, String mome, Double price, Category category) {
		super();
		this.id = id;
		this.mome = mome;
		this.price = price;
		this.category = category;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMome() {
		return mome;
	}

	public void setMome(String mome) {
		this.mome = mome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id;
	}
	
}
