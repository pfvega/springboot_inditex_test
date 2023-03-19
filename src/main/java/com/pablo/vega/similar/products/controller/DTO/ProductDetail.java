package com.pablo.vega.similar.products.controller.DTO;

public class ProductDetail {
	private String id;
	private String name;
	private double price;
	private boolean availability;
	
	public ProductDetail() {
	}	
	
	public ProductDetail(String id, String name, double price, boolean availability) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.availability = availability;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean isAvailability() {
		return availability;
	}
	
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}	
	
}
