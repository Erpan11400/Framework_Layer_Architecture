package model;

import java.util.Random;

public class Transfer {
	public void payTransfer(double price) {
		long accNum = new Random().longs(1000000000L, 10000000000L)
				.findFirst().getAsLong();
		
		double finalPrice = price * 1.1;
		System.out.printf("Price   : $%.2f | with Account Number : %d\n", finalPrice, accNum);
		
	}
}
