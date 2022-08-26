package com.proshanto.reactivemongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document(collection="product")
public class Product {
	@Id
	private String id;
	private String name;
	private int qty;
	private double price;
	public String getId() {
		return id;
	}
	public Product setId(String id) {
		this.id = id;
		return this;
	}
	public void setIdD(String id) {
		this.id = id;
		
	}
	public String getName() {
		return name;
	}
	public Product setName(String name) {
		this.name = name;
		return this;
	}
	public int getQty() {
		return qty;
	}
	public Product setQty(int qty) {
		this.qty = qty;
		return this;
	}
	public double getPrice() {
		return price;
	}
	public Product setPrice(double price) {
		this.price = price;
		return this;
	}
	
	
}
