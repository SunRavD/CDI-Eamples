package org.demo.example.cdi.alternates;

@Card(cardType={CardType.VISA_CARD})
public class VisaCardPayment implements PaymentBy {

	private double charges = 0.23;
	
	@Override
	public void paymentChargeAmount(Double aDouble) {
		System.out.println(" VisaCardPayment charge amount : "+(aDouble*charges));
		
	}

}
