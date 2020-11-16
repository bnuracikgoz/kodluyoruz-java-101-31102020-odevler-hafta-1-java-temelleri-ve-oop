package com.week1.main.question6;

public class Printer {

public static void printPDFDocument(PDFDocument PDFDocument) {
		
		System.out.println("PDF Document: " + PDFDocument.getBody());
	}

public static void WordDocument(WordDocument WordDocument) {
	
	System.out.println("Word Document: " + WordDocument.getBody());
}
}
