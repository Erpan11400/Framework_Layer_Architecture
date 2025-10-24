import java.util.ArrayList;
import java.util.Scanner;

import db.Database;
import factory.ConfectionaryFactory;
import factory.CupcakeFactory;
import factory.TartFactory;
import model.Confectionary;

public class Main {

	Scanner sc = new Scanner(System.in);
	private final Database db = Database.getInstance();

	public Main() {

		int input = 0;

		do {
			System.out.println("Nom Nom Co.");
			System.out.println("1. Bake Confectionary");
			System.out.println("2. View Confectionary Order");
			System.out.println("3. Exit");
			System.out.print(">> ");

			input = sc.nextInt();

			switch (input) {
			case 1:
				bakeConfectionary();
				break;
			case 2:
				viewConfectionary();
				break;
			case 3:
				System.out.println("Terima kasih");
				break;
			default:
				System.out.println("Masukan pilihan dengan benar!!");
				break;
			}

		} while (input != 3);
	}

	private void bakeConfectionary() {
		String type, name, softness, addTop, topping, payment;
		double price;
		ArrayList<String> toppings = new ArrayList<>();

		// Type
		do {
			System.out.println("Input confectionary type [Cupcake | Tart][case sensitive]: ");
			type = sc.next();
		} while (!type.equals("Cupcake") && !type.equals("Tart"));

		// Type
		do {
			System.out.println("Input confectionary name [length between 5-15]: ");
			name = sc.next();
		} while (name.length() < 5 || name.length() > 15);

		// Softness
		do {
			System.out.println("Input confectionary softness [Fluffy | Medium | Hard][case sensitive]: ");
			softness = sc.next();
		} while (!softness.equals("Fluffy") && !softness.equals("Medium") && !softness.equals("Hard"));

		// Topping confirm
		do {
			System.out.println("Add additional topping [Y | N][case sensitive]: ");
			addTop = sc.next();
		} while (!addTop.equals("Y") && !addTop.equals("N"));

		if (addTop.equals("Y")) {
			for (int i = 0; i < 3; i++) {
				// Input Topping
				do {
					System.out.printf("Input topping %d[length between 1-10]: ", i + 1);
					topping = sc.next();
				} while (topping.length() < 1 || topping.length() > 10);
			toppings.add(topping);
			}
		}
		
		// Price
		do {
			System.out.println("Input confectionary price [10.0 - 50.0]: ");
			price = sc.nextDouble();
		} while (price < 10.0 || price > 50.0);
		
		// Payment Type
		do {
			System.out.println("What kind of payment [Cash | Transfer | Crypto][case sensitive]: ");
			payment = sc.next();
		} while (!payment.equals("Cash") && !payment.equals("Transfer") && !payment.equals("Crypto"));
	
		ConfectionaryFactory factory;
		if (type.equals("Cupcake")) {
			factory = new CupcakeFactory();
		}
		else {
			factory = new TartFactory();
		}
		
		Confectionary confec = factory.createConfectionary(name, softness, toppings, price, payment);
		db.addConfectionary(confec);
		
		System.out.println("Confectionary Baked!");
		System.out.println("press enter to continue...");
		sc.nextLine();
	}

	private void viewConfectionary() {
		ArrayList<Confectionary> orders = db.getConfeList();
		if (orders.isEmpty()) {
			System.out.println("No Confectionary yet...");
		}
		else {
			for (Confectionary c : orders) {
				c.displayDetail();
				System.out.println("========================");
			}
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
