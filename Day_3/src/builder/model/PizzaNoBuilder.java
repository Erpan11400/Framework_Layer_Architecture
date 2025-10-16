package builder.model;

public class PizzaNoBuilder {
	private String topping;
	private String size;
	private String crust;
	private String cheese;
	private String sauce;
	private String sideDish;

	public PizzaNoBuilder(String topping, String size, String crust, String cheese, String sauce, String sideDish) {
		this.topping = topping;
		this.size = size;
		this.crust = crust;
		this.cheese = cheese;
		this.sauce = sauce;
		this.sideDish = sideDish;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust(String crust) {
		this.crust = crust;
	}

	public String getCheese() {
		return cheese;
	}

	public void setCheese(String cheese) {
		this.cheese = cheese;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public String getSideDish() {
		return sideDish;
	}

	public void setSideDish(String sideDish) {
		this.sideDish = sideDish;
	}
	
	@Override
	public String toString() {
		return "Pizza [topping=" + topping + ", size=" + size + ", crust=" + crust + ", cheese=" + cheese + ", sauce="
				+ sauce + ", sideDish=" + sideDish + "]";
	}
}
