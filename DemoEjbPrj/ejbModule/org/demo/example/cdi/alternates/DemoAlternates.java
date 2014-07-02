/**
 * 
 */
package org.demo.example.cdi.alternates;

import javax.inject.Inject;

/**
 * @author sunkarar
 *
 */
public class DemoAlternates {;


	
	@Inject
	@Card(cardType={CardType.VISA_CARD})
	private PaymentBy visaPayment;
	
	@Inject
	@Card(cardType={CardType.MATER_CARD})
	private PaymentBy mardPayment;
	
	@Inject
	@Card(cardType={CardType.AMX_CARD})
	private PaymentBy amexPayment;
	
	@Inject
	@Card(cardType={CardType.RUPE_CARD})
	private PaymentBy rupayPayment;
	
	

}
