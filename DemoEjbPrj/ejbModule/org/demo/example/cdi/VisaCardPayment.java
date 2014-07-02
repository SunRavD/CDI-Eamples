package org.demo.example.cdi;

import java.math.BigDecimal;

import javax.inject.Named;

@VisaCard
public class VisaCardPayment implements IPayment {

	@Override
	public void pay(BigDecimal amount) {
		System.out.println("Visa Card Amount payment is "+amount);
		
	}
	
	

}
