package db;

import java.util.ArrayList;

import model.Confectionary;

public class Database {
	private static Database instance = null;
	private final ArrayList<Confectionary> confectionaries;
	
	private Database() {
		confectionaries = new ArrayList<>();
	}
	
	public synchronized static Database getInstance() {
		if(instance == null) {
			instance = new Database(); 
			System.out.println("Database berhasil dibuat...");
		}
		return instance;
	}
	
	public void addConfectionary(Confectionary confectionary) {
		this.confectionaries.add(confectionary);
	}
	
	public ArrayList<Confectionary> getConfeList() {
		return this.confectionaries;
	}
}
