package abstaction;

public class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return length * width;
	}
}
