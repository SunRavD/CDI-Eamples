package org.demo.example.cdi;

import java.math.BigDecimal;

import javax.inject.Named;

@MasterCard
public class MasterCardPayment implements IPayment {

	@Override
	public void pay(BigDecimal amount) {
		System.out.println("Mater Card Payment Amount is "+amount);
	}

}
