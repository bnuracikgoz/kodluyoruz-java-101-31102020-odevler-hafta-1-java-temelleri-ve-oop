package com.week1.main.question5;

import java.util.Random;
public class Application {

	public static void main(String[] args) {
	
	Random random = new Random();
	int[] dizi = new int[100];
    
	for(int i=0; i<100; i++) {
		//dizi[i]= random.nextInt();
		dizi[i]= random.nextInt(100+1); }
		
	System.out.println("Dizideki tek sayılar :");
	for(int i=0; i<100; i++) {
		if(dizi[i]%2!=0) {
			System.out.print(dizi[i]+" ");}
		}
	
	System.out.println();
	
	System.out.println("Dizideki çift sayılar :");
	for(int i=0; i<100; i++) {
		
		if(dizi[i]%2==0) {
			System.out.print(dizi[i]+" ");}
		}
	}
	
}


