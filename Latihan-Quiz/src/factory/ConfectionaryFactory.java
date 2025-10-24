package factory;

import java.util.ArrayList;

import model.Confectionary;

public abstract class ConfectionaryFactory {
	public abstract Confectionary createConfectionary(String name, String softness, ArrayList<String> toppings,
			double besePrice, String paymentType);
}
