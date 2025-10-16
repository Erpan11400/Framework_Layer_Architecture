package builder.model;

public class PizzaWithBuilder {
	private String topping;
	private String size;
	private String crust;
	private String cheese;
	private String sauce;
	private String sideDish;

	public PizzaWithBuilder(String topping, String size, String crust, String cheese, String sauce, String sideDish) {
		this.topping = topping;
		this.size = size;
		this.crust = crust;
		this.cheese = cheese;
		this.sauce = sauce;
		this.sideDish = sideDish;
	}

	@Override
	public String toString() {
		return "Pizza [topping=" + topping + ", size=" + size + ", crust=" + crust + ", cheese=" + cheese + ", sauce="
				+ sauce + ", sideDish=" + sideDish + "]";
	}
}
