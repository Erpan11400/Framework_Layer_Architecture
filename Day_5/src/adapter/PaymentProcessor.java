package adapter;

import adapter.interfaces.CashPaymentInterface;

public class PaymentProcessor {
	public void process(CashPaymentInterface payment, double price) {
		payment.payWithCash(price);
	}
}
