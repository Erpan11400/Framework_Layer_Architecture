package model;

import java.util.ArrayList;
import java.util.stream.Collectors;

import adapter.CashAdapter;
import adapter.CryptoAdapter;
import adapter.TransferAdapter;

public abstract class Confectionary {
	protected String name;
	protected String softness;
	protected ArrayList<String> toppings;
	protected double basePrice;
	protected String paymentType;
	protected String type;
	
	public Confectionary(String name, String softness, ArrayList<String> toppings, double basePrice,
			String paymentType) {
		this.name = name;
		this.softness = softness;
		this.toppings = toppings;
		this.basePrice = basePrice;
		this.paymentType = paymentType;
	}
	
	public void displayDetail() {
		System.out.println("Name : " + this.name + "(" + this.type + ")");
		System.out.println("Softness : " + this.softness);
		
		String toppingStr = "-";
		if(!this.toppings.isEmpty() && this.toppings != null) {
			toppingStr = toppings.stream().collect(Collectors.joining(" "));
		}
		
		System.out.println("Toppings : " + toppingStr);
		System.out.println("Payment Method : " + this.paymentType);
		
		Payment paymentAdapter;
		if(paymentType.equals("Cash")) {
			paymentAdapter = new CashAdapter(new Cash());
		}else if(paymentType.equals("Transfer")) {
			paymentAdapter = new TransferAdapter(new Transfer());
		}else {
			paymentAdapter = new CryptoAdapter(new Crypto());
		}
		
		paymentAdapter.processPayment(this.basePrice);
	}
	
}
