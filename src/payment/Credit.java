package payment;

import order.Order;

public class Credit extends Payment implements Authorization {
	private long number;
	private String type;
	private String expDate;

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	@Override
	public boolean authorized() {
		// TODO Auto-generated method stub
		Order ref = getOrder();
		if (expDate.equals(ref.getDate())) {
			return true;
		}
		return false;
	}

}
