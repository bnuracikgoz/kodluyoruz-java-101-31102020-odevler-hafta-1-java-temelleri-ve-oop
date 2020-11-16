package com.week1.main.question7;

public class Application {

	//sadece kalıtım mantığıyle sınıfları oluşturdum. 
	//Aralarındaki olay örgüsünü kuramadım hocam.
	
	
	public static void main(String[] args) {
		
	DatabaseOperations dbOperations = new DatabaseOperations("jdbc:Mysql//11.145.23.22");
	boolean dbConnectionStatus=dbOperations.open();
	System.out.println(dbConnectionStatus);
	
	//Report runQuery= dbOperations.runQuery("jdbc:Mysql//11.145.23.22");
	//Report runQuery(String q)
	Report report=new Report();
	Printer.print(report);
	String convertMD5= PersonelReport.hashMD5Result();
	System.out.println(convertMD5);
	
	
	}
}
