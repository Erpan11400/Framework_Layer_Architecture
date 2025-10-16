package builder;

import builder.model.PizzaWithBuilder;

public class PizzaBuilder {
	private String topping = null;
	private String size = null;
	private String crust = null;
	private String cheese = null;
	private String sauce = null;
	private String sideDish = null;

	public PizzaBuilder() {

	}

	public PizzaBuilder addTopping(String topping) {
		this.topping = topping;
		return this;
	}

	public PizzaBuilder addSize(String size) {
		this.size = size;
		return this;
	}

	public PizzaBuilder addCrust(String crust) {
		this.crust = crust;
		return this;
	}

	public PizzaBuilder addCheese(String cheese) {
		this.cheese = cheese;
		return this;
	}

	public PizzaBuilder addSauce(String sauce) {
		this.sauce = sauce;
		return this;
	}

	public PizzaBuilder addSideDish(String sideDish) {
		this.sideDish = sideDish;
		return this;
	}

	public PizzaWithBuilder build() {
		PizzaWithBuilder pizza = new PizzaWithBuilder(topping, size, crust, cheese, sauce, sideDish);

		topping = null;
		size = null;
		crust = null;
		cheese = null;
		sauce = null;
		sideDish = null;

		return pizza;
	}
}
