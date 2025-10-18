package adapter;

import adapter.interfaces.CashPaymentInterface;
import adapter.interfaces.CashlessPaymentInterface;

public class PaymentAdapter implements CashPaymentInterface {

	private CashlessPaymentInterface transfer;
	
	
	public PaymentAdapter(CashlessPaymentInterface transfer) {
		super();
		this.transfer = transfer;
	}



	@Override
	public void payWithCash(double price) {
		System.out.printf("$%.2f %s\n",
							transfer.process(price),
							transfer.getDetail());
	}

}
