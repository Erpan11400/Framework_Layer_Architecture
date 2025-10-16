package abstaction;

public class Main {
	
	Main() {
		Circle circle = new Circle(3);
		Rectangle rectangle = new Rectangle(4, 5);
		
		circle.display();
		rectangle.display();
		
		System.out.println(circle.area());
		System.out.println(rectangle.area());
	}
	
	
	public static void main(String[] args) {
		new Main();

	}
}
