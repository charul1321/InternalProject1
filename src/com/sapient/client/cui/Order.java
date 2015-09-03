package com.sapient.client.cui;

public class Order {
	Object date;
	Object status;
	NewCustomer customer;
	Payment payment;
	OrderDetail orderdetail;
	public Object getDate() {
		return date;
	}
	public void setDate(Object date) {
		this.date = date;
	}
	public Object getStatus() {
		return status;
	}
	public void setStatus(Object status) {
		this.status = status;
	}
	public NewCustomer getCustomer() {
		return customer;
	}
	public void setCustomer(NewCustomer customer) {
		this.customer = customer;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public OrderDetail getOrderdetail() {
		return orderdetail;
	}
	public void setOrderdetail(OrderDetail orderdetail) {
		this.orderdetail = orderdetail;
	}
	
	

}
