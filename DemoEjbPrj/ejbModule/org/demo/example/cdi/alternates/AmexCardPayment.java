/**
 * 
 */
package org.demo.example.cdi.alternates;

/**
 * @author sunkarar
 *
 */
@Card(cardType={CardType.AMX_CARD})
public class AmexCardPayment implements PaymentBy {
	private double charges = 0.231;
	@Override
	public void paymentChargeAmount(Double aDouble) {
		System.out.println(" AmexCardPayment charge amount : "+(aDouble*charges));
	}
}
