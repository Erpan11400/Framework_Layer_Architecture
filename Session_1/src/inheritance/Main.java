package inheritance;

public class Main {
	
	public Main() {
		Cat cat = new Cat();
		
		cat.name = "Ciko";
		cat.age = 10;
		
		cat.color = "Brown";
		
		cat.slepp();
		
		cat.said();
		
		System.out.println("\nName : " + cat.name);
		System.out.println("Age : " + cat.age);
		System.out.println("Color : " + cat.color);
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
