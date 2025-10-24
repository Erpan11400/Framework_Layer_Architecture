package model;

import java.util.Random;

public class Crypto {
	public void payCrypto(double price) {
		String address = "0x" + generateRandomChar("abcdefghijklmnopqrstuvwxyz0123456789", 12);
		double finalPrice = price / 2;
		System.out.printf("Price   : $%.2f | with Address : %s\n", finalPrice, address);
	}
	
	private String generateRandomChar(String ref, int length) {
		StringBuilder sb = new StringBuilder();
		Random rand = new Random();
		for (int i = 0; i < length; i++) {
			sb.append(ref.charAt(rand.nextInt(ref.length())));	
		}
		return sb.toString();
	}
}
