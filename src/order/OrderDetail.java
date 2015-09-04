package order;

import item.Item;

public class OrderDetail {
	private int quantity;
	private boolean taxStatus;
	private Order order;
	private Item item;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean getTaxStatus() {
		return taxStatus;
	}

	public void setTaxStatus(boolean taxStatus) {
		this.taxStatus = taxStatus;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public double calcSubTotal() {
		return item.getPriceForQuantity() * quantity;
	}

	public double calcWeight() {
		return item.getShippingWeight() * quantity;
	}
}
