package com.proshanto.reactivemongo.dto;

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
public class ProductDTO {

	private String id;
	private String name;
	private int qty;
	private double price;
	
	public String getId() {
		return id;
	}
	public ProductDTO setId(String id) {
		  this.id = id;
		  return this;
	}
	public String getName() {
		return name;
	}
	public ProductDTO setName(String name) {
		this.name = name;
		return this;
	}
	public int getQty() {
		return qty;
	}
	public ProductDTO setQty(int qty) {
		this.qty = qty;
		return this;
	}
	public double getPrice() {
		return price;
	}
	public ProductDTO setPrice(double price) {
		this.price = price;
		return this;
	}
	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", qty=" + qty
				+ ", price=" + price + "]";
	}
	
	
}
