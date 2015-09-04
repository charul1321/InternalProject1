package com.sapient.client.cui;

public class Item {
	
	private double shippingWeight;
	private String description;
	private double price;
private OrderDetail orderdetail;
	
	public double getShippingWeight() {
		return shippingWeight;
	}
	public void setShippingWeight(double shippingWeight) {
		this.shippingWeight = shippingWeight;
	}
	public String getDescription(){
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public OrderDetail getOrderdetail() {
		return orderdetail;
	}
	public void setOrderdetail(OrderDetail orderDetail){
		this.orderdetail = orderDetail;
	}
	
 public double getPriceForQuantity()
 {
	 return price;
 }
 public double getWeight()
 {
	 return shippingWeight;
 }
}


