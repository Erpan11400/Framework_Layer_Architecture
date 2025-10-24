package adapter;

import model.Crypto;
import model.Payment;

public class CryptoAdapter implements Payment {
	private final Crypto c;
	
	public CryptoAdapter(Crypto c) {
		this.c = c;
	}

	@Override
	public void processPayment(double price) {
		c.payCrypto(price);
	}

}
