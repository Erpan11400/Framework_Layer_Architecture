package adapter.interfaces;

public interface CashlessPaymentInterface {
	public double process(double price);
	public String getDetail();
}
