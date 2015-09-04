package payment;

public class Cash extends Payment {
	private long cashTendered;

	public long getCashRendered() {
		return cashTendered;
	}

	public void setCashTendered() {
		cashTendered = Math.round(getAmount());
	}

}
