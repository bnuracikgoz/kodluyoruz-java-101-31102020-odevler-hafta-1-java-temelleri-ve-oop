package com.week1.main.question2;

import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
		System.out.println("Lütfen gerçekleştirmek istediğiniz işleme karşılık gelen numarayı giriniz :");
		int option= sc.nextInt();
	
		
		System.out.printf("%d numaralı işlemi gerçekleştirmek için 2 adet sayı giriniz\n",option);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		sc.close();
		
			switch(option) {
			case 1:  System.out.printf("İşlem: %d + %d = %d",number1,number2,(number1+number2));
					 break;
			
			case 2:  System.out.printf("İşlem: %d - %d = %d",number1,number2,(number1-number2));
					 break;
			
			case 3:  System.out.printf("İşlem: %d * %d = %d",number1,number2,(number1*number2));
					 break;
					 
			case 4:  System.out.printf("İşlem: %d / %d = %d",number1,number2,(number1/number2));
					 break;
					 
			default: System.out.println("Geçersiz işlem tipi!");
					 break;			
		}
		
	}
}
