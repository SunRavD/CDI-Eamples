package org.demo.example.cdi.alternates;

@Card(cardType={CardType.MATER_CARD})
public class MasterCardPayment implements PaymentBy {

	private double charges = 0.213;

	@Override
	public void paymentChargeAmount(Double aDouble) {
		System.out.println(" MasterCardPayment charge amount : "
				+ (aDouble * charges));

	}

}
