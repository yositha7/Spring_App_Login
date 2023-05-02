package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cosmetics {
@Id
private int sno;
private String item;
private String price;
private String quantity;
private String discount;
private String  description;
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getItem() {
	return item;
}
public void setItem(String item) {
	this.item = item;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public String getDiscount() {
	return discount;
}
public void setDiscount(String discount) {
	this.discount = discount;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}