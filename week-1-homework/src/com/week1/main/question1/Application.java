package com.week1.main.question1;

import java.util.Scanner;

public class Application {
		
	public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	String userPassword="12345";

	System.out.println("Lütfen şifrenizi giriniz: ");
	String password=sc.nextLine();
	
	sc.close();
	
	if(password.equals(userPassword)) {
		
		System.out.println("Giriş Başarılı!");
	}
	
	else {
			
		System.out.println("Giriş Başarısız!"); }	
			
   }
}
