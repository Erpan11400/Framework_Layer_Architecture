package factory;

import java.util.ArrayList;

import model.Confectionary;
import model.Tart;

public class TartFactory extends ConfectionaryFactory {

	@Override
	public Confectionary createConfectionary(String name, String softness, ArrayList<String> toppings, double besePrice,
			String paymentType) {
		return new Tart(name, softness, toppings, besePrice, paymentType);
	}

}
