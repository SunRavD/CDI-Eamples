package org.demo.example.cdi.alternates;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.Extension;
import javax.enterprise.inject.spi.ProcessAnnotatedType;


public class PaymentCardExtension implements Extension {
 
	private List<String> cardTypeList;
	
	public PaymentCardExtension() {
		cardTypeList = new ArrayList<String>();
		cardTypeList.add("MATER_CARD");
		cardTypeList.add("VISA_CARD");
		cardTypeList.add("RUPE_CARD");
		cardTypeList.add("AMX_CARD");
	}
	
	public <T> void processAnnotated(@Observes ProcessAnnotatedType<T> types) {
		Card card = types.getAnnotatedType().getJavaClass().getAnnotation(Card.class);
		if(card!=null) {
			if(isCardTypeExists(card.cardType()))
			types.veto();
		} 
	}

	private boolean isCardTypeExists(CardType[] cardType) {
		// TODO Auto-generated method stub
		for(CardType card:cardType) {
			if(cardTypeList.contains(card.name())) {
				return true;
			}
		}
		return false;
	}
}
