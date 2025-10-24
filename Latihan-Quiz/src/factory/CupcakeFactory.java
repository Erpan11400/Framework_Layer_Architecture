package factory;

import java.util.ArrayList;

import model.Confectionary;
import model.Cupcake;

public class CupcakeFactory extends ConfectionaryFactory {

	@Override
	public Confectionary createConfectionary(String name, String softness,
			ArrayList<String> toppings, double besePrice, String paymentType) {
		return new Cupcake(name, softness, toppings, besePrice, paymentType);
	}

}
