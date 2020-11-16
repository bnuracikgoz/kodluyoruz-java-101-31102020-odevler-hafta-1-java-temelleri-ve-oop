package com.week1.main.question7;

public class DatabaseOperations {
	
	protected String q= " ";
	
	public DatabaseOperations() {
		this.q = " ";
	}
	//Parametre alan kurucu fonksiyon
	public DatabaseOperations(String q) {
		this.q = q;
	}
	
	public boolean open() {
		
		DatabaseOperations.show(q);
		
		return true;
	}
	
	Report runQuery(String q) {
		
		return this.runQuery(q);
		
	}

	public static void show(String q) {
	
		System.out.println("Database runQuery:" + q);
	}

}
