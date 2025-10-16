package abstaction;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
}
