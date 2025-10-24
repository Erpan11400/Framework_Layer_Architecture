package adapter;

import model.Payment;
import model.Transfer;

public class TransferAdapter implements Payment {
	private final Transfer t;
	
	
	public TransferAdapter(Transfer t) {
		this.t = t;
	}

	@Override
	public void processPayment(double price) {
		t.payTransfer(price);
	}

}
