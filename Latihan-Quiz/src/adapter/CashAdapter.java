package adapter;

import model.Cash;
import model.Payment;

public class CashAdapter implements Payment {
	private final Cash c;
	
	
	public CashAdapter(Cash c) {
		this.c = c;
	}

	@Override
	public void processPayment(double price) {
		c.payCash(price);

	}

}
