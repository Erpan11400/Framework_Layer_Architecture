package adapter.paymentType;

import adapter.interfaces.CashPaymentInterface;

public class Cash implements CashPaymentInterface {

	@Override
	public void payWithCash(double price) {
		System.out.printf("$%.2f\n", price);
	}
	
}
