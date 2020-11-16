package com.week1.main.question7;
import java.util.*;
public class Report {
	
	protected String name="";
	protected String result="";
	protected Date createDate;
	
	//Kurucu fonksiyon
	public Report() {
		this.name = "NO_NAME";
		this.result = "NO_RESULT";
		this.createDate=null;
	}
	//Parametre alan kurucu fonksiyon
	public Report(String name, String result, Date createDate) {
		this.name = name;
		this.result = result;
		this.createDate=createDate;
	}
	
	//Set fonksiyonları
	public void setName(String name) {
		this.name = name;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	public void setResult(Date createDate) {
		this.createDate=createDate;
	}
	
	//get foksiyonları
	public String getName() {
		return this.name;
	}
	public String getResult() {
		return this.result;
	}
	public Date getCreateDate() {
		return this.createDate;
	}
	
	
}

