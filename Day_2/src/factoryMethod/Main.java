package factoryMethod;

import java.util.Scanner;

import factoryMethod.factory.CarFactory;
import factoryMethod.factory.HondaFactory;
import factoryMethod.factory.HyundaiFactory;
import factoryMethod.factory.ToyotaFactory;
import factoryMethod.model.Car;

public class Main {

	Scanner scanner = new Scanner(System.in);
	
	public Main() {


		String brand;
		Car car;
		System.out.println("Please choose a car brand: ");
		brand = scanner.nextLine();

		// PAKE FACTORY
		CarFactory carFactory;

		if (brand.equals("Toyota")) {
			carFactory = new ToyotaFactory();
		} else if (brand.equals("Honda")) {
			carFactory = new HondaFactory();
		} else if (brand.equals("Hyundai")) {
			carFactory = new HyundaiFactory();
		} else {
			carFactory = null;
		}
		
		if(carFactory != null) {			
			car = carFactory.createCar();
			System.out.println(car);
		}
		else System.out.println("Input Invalid");
	}

	public static void main(String[] args) {
		new Main();
	}

}
