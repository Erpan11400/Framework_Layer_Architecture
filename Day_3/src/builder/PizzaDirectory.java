package builder;

import builder.model.PizzaWithBuilder;

public class PizzaDirectory {

	public PizzaWithBuilder createMarinara() {
		PizzaBuilder p = new PizzaBuilder();
		return p.addTopping("Tomato").addSauce("Marinara").build();
	}
	
	public PizzaWithBuilder createMeatLover() {
		PizzaBuilder p = new PizzaBuilder();
		return p.addTopping("Meat and Sausage").addSauce("Tomato").addCrust("Nugget").build();
	}
}
