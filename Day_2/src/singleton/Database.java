package singleton;

import java.util.ArrayList;

public class Database {

	private ArrayList<String> data;
	
	private static Database instance = null;
	
	// -> Thread Safe
	public static Database getInstance() {
		if (instance == null) {
		
			synchronized(Database.class) {
				if (instance == null) {
					instance = new Database();
				}
			}
			
		}
		return instance;
	}
	
//	// -> Simple Singleton
//	public static Database getInstance() {
//		if (instance == null) {
//			instance = new Database();
//		}
//		return instance;
//	}
	
	public Database() {
		data = new ArrayList<>();
		System.out.println("Created a new database connection!");
	}

}