package com.week1.main.question3;

import java.util.Random;
public class Application {
	
	public static void main(String[] args) {
	
	Random random = new Random();
	int[] dizi= new int[10];
	
	for(int i=0;i<10;i++) {
		// [0,100] aralığındaki tamsayıları ele aldım.
		dizi[i]= random.nextInt(100+1);
		//dizi[i]= random.nextInt();
		System.out.println(dizi[i]);}
	
	double average=arrayAverage(dizi);
	System.out.print("Random dizinin ortalaması=");
	System.out.print(average);
	
}
	
static double arrayAverage(int[] dizi) {
	
	double sum = 0;
	
	for (int i=0;i<10;i++) {
		sum=sum+dizi[i]; }
	
	//System.out.println(sum);
	double avrg =sum/10;
	//System.out.println(avrg);
	
		return avrg;
	}
}

