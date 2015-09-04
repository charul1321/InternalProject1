package item;

import order.OrderDetail;
import java.util.logging.Logger;

import java.util.logging.ConsoleHandler;

import java.util.logging.Level;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if (description == null) {
			throw new IllegalArgumentException("Null description is entered") ; 
			}
		
		this.description = description;
	}

	public OrderDetail getOrderDetail() {
		return orderdetail;
	}

	public void setOrderDetail(OrderDetail orderDetail) {
		if (orderDetail==null) {
			throw new IllegalArgumentException("Null orderdetail is entered") ; 
			
		}
		
		this.orderdetail = orderDetail;
		}
		
	

	public double getPriceForQuantity() {
		return price;
	}

	public double getWeight() {
		return shippingWeight;
	}
}
