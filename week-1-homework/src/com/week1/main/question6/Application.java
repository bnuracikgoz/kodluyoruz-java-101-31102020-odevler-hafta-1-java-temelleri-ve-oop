package com.week1.main.question6;

public class Application {

	public static void main(String[] args) {
		
	// 'new' anahtar kelimesi ile Document sınıfından bir nesne oluşturduk.
	PDFDocument pdfDocument = new PDFDocument("busenur_acikgoz_cv_pdf");
	
	// Printer sınıfındaki 'printPDFDocument' fonksiyonu static tipindedir. 
	// Dolayısıyla Printer sınıfından bir nesne oluşturmadan direkt sınıf üzerinden 'print' fonksiyonunu çağırabiliriz.
	Printer.printPDFDocument(pdfDocument);
	
	
	// 'new' anahtar kelimesi ile Document sınıfından bir nesne oluşturduk.
	WordDocument wordDocument = new WordDocument("busenur_acikgoz_cv");
	
	// Printer sınıfındaki 'WordDocument' fonksiyonu static tipindedir. 
	// Dolayısıyla Printer sınıfından bir nesne oluşturmadan direkt sınıf üzerinden 'print' fonksiyonunu çağırabiliriz.
	Printer.WordDocument(wordDocument);
		
	}
}
