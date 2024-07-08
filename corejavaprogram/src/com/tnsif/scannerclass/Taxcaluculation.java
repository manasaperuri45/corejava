package com.tnsif.scannerclass;

public class Taxcaluculation {
	public void caluculatetax(person p) {
		if(p.getIncome()<=1600) {
			p.setIncome(0);
		}
		else if(p.getIncome()>1600 & p.getIncome()<30000) {
			p.setTax(5);
		}
		else {
			p.setTax(10);
		}
	}
}
