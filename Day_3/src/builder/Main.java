package builder;

import builder.model.PizzaNoBuilder;
import builder.model.PizzaWithBuilder;

public class Main {

	public Main() {

		PizzaNoBuilder pizza = new PizzaNoBuilder("Pepperoni", "Small", null, null, null, null);
		System.out.println(pizza.toString());
		System.out.println();

		// OBJ CREATION WITH BUILDER
		PizzaBuilder builder = new PizzaBuilder();
		PizzaWithBuilder p1 = builder.addTopping("Pepperoni").addSize("Large").build();
		System.out.println(p1.toString());
		System.out.println();
		
		PizzaWithBuilder p2 = builder.addTopping("Meatball").addSauce("Tomato").build();
		System.out.println(p2.toString());
		System.out.println();
		
		PizzaDirectory d = new PizzaDirectory();
		PizzaWithBuilder p3 = d.createMarinara();
		System.out.println(p3.toString());
		System.out.println();
		
		PizzaWithBuilder p4 = d.createMeatLover();
		System.out.println(p4.toString());
		System.out.println();
		}

	public static void main(String[] args) {
		new Main();
	}
}
