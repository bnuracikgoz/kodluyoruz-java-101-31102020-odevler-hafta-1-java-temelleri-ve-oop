package com.week1.main.question7;

import java.util.Date;

public class SalesReport extends Report {

	String[] authorizedDepartments;
	public SalesReport() {
		
		// Report sınıfının kurucu metodunu çağırıyor.
		super();
	}
	
	public SalesReport(String[] authorizedDepartments, String name, String result, Date createDate) {
		// Report sınıfının parametreli kurucu metodunu çağırıyor.
		super(name, result,createDate);
		
		this.authorizedDepartments=authorizedDepartments;
	}
   
		//get foksiyonu
		public String[] getAuthorizedDepartments() {
			return this.authorizedDepartments;
		}
		
		//set fonksiyonu
		public void setAuthorizedDepartments(String[] AuthorizedDepartments) {
			this.authorizedDepartments = AuthorizedDepartments;
		}
	
	
}
