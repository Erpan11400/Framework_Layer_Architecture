package prototype.nodel;

public class Cat extends Animal {
	private String catRace;
	private int clawLength;

	public Cat(String name, String catRace, int clawLength) {
		super(name);
		this.catRace = catRace;
		this.clawLength = clawLength;
	}

	// BUAT PROTOTYPE
	public Cat(Cat cat) {
		super(cat);
		this.catRace = cat.catRace;
		this.clawLength = cat.clawLength;
	}

	public String getCatRace() {
		return catRace;
	}

	public void setCatRace(String catRace) {
		this.catRace = catRace;
	}

	public int getClawLength() {
		return clawLength;
	}

	public void setClawLength(int clawLength) {
		this.clawLength = clawLength;
	}

	public void printDetail() {
		System.out.println(this.getName());
		System.out.println(this.getCatRace());
		System.out.println(this.getClawLength());
	}

	// BUAT PROTOTYPE
	@Override
	public Animal clone() {
		return new Cat(this);
	}
}
