package org.demo.example.cdi;

import javax.inject.Inject;
import javax.inject.Named;

public class ExampleCDI {
	@Inject
	@VisaCard
	private  IPayment payment;

}
