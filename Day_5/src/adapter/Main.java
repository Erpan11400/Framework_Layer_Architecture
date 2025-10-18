package adapter;

import adapter.paymentType.Cash;
import adapter.paymentType.Transfer;

public class Main {

	public Main() {
		PaymentProcessor payment = new PaymentProcessor();
		payment.process(new Cash(), 25);
		payment.process(new PaymentAdapter(new Transfer()), 25);
	}
	
	public static void main(String[] args) {
		new Main();	
	}
}
