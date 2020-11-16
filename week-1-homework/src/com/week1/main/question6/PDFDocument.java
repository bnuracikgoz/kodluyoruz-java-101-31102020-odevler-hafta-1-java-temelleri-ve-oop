package com.week1.main.question6;

public class PDFDocument {
	
	String body = "";
	
	// Parametre alan kurucu fonksiyondur
	public PDFDocument(String body) {
		this.body = body;
	}
	
	// "body" değişkenine ait değeri dışarıya döndürecek metot
	public String getBody() {
		return this.body;
	}
}
