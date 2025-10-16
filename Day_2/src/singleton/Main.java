package singleton;

public class Main {
	public static void main(String[] args) {

		Runnable run1 = new Runnable() {

			@Override
			public void run() {
				Database db = Database.getInstance();
				System.out.println(db);
			}
		};

		Thread thread1 = new Thread(run1);
		Thread thread2 = new Thread(run1);

		thread1.start();
        thread2.start();
	}
}
