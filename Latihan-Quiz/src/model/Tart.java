package model;

import java.util.ArrayList;

public class Tart extends Confectionary {

	public Tart(String name, String softness, ArrayList<String> toppings, double besePrice, String paymentType) {
		super(name, softness, toppings, besePrice, paymentType);
		this.type = "Tart";
	}

}
