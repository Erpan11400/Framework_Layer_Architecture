package prototype.nodel;

public abstract class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	// BUAT PROTO
	public Animal(Animal animal) {
		this.name = animal.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// BUAT PROTO
	public abstract Animal clone();
}
