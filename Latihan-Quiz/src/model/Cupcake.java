package model;

import java.util.ArrayList;

public class Cupcake extends Confectionary {

	public Cupcake(String name, String softness, ArrayList<String> toppings, double besePrice, String paymentType) {
		super(name, softness, toppings, besePrice, paymentType);
		this.type = "Cupcake";
	}
}
