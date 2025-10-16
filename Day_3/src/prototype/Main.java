package prototype;

import prototype.nodel.Cat;

public class Main {
	public Main() {
		// Contoh copy tanpa prototype
		Cat cat = new Cat("Riki", "Shorthair", 1);

		Cat cat2 = cat;

		// Ini bukan copy value, tapi mereka berdua cuman reference 1 object yang sama
		cat.printDetail();
		cat2.printDetail();

		// Jadi misal kita coba ganti value cat 1,
		// value di cat 2 juga keubah karena objectnya sama
		cat.setName("Ricky");
		cat2.printDetail(); // Jadi Ricky

		// CLONE OBJECT WITH PROTOTYPE
		Cat cat3 = (Cat) cat.clone();
		cat.setName("Budi"); // cat3 punya name tetep Ricky meski diubah
		cat3.printDetail();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
}
