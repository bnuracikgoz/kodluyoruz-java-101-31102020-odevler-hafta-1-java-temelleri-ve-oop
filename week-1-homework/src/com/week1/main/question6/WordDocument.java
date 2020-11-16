package com.week1.main.question6;

public class WordDocument {

	String body = "";
	
	// Parametre alan kurucu fonksiyondur
	public WordDocument(String body) {
		this.body = body;
	}
	
	// "body" değişkenine ait değeri dışarıya döndürecek metot
	public String getBody() {
		return this.body;
	}
}
