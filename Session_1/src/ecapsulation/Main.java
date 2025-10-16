package ecapsulation;

public class Main {

	public Main() {
		Student student = new Student();
		student.setName("Ervan");
		student.setAge(20);
		
		System.out.println("Name : " + student.getName());
		System.out.println("Age : " + student.getAge());
	}
	
	public static void main(String[] args) {
		new Main();

	}

}
