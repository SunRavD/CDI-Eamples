/**
 * 
 */
package org.demo.example.cdi.alternates;

/**
 * @author sunkarar
 *
 */
@Card(cardType={CardType.RUPE_CARD})
public class RupePayCardPayment implements PaymentBy {
	private double charges = 0.231;
	@Override
	public void paymentChargeAmount(Double aDouble) {
		System.out.println(" AmexCardPayment charge amount : "+(aDouble*charges));
	}
}
