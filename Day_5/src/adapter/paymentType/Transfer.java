package adapter.paymentType;

import java.util.Random;

import adapter.interfaces.CashlessPaymentInterface;

public class Transfer implements CashlessPaymentInterface {

	@Override
	public double process(double price) {
		return price * 1.1;
	}

	@Override
	public String getDetail() {
		Random rand = new Random();
		
		String accID = "";
		
		for (int i = 0; i < 10; i++) {
			accID += rand.nextInt(10); 
		}
		
		return "with Account ID : " + accID;
	}

}
