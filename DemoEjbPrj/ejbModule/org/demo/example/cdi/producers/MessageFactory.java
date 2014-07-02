/**
 * 
 */
package org.demo.example.cdi.producers;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

/**
 * @author sunkarar
 *
 */
public class MessageFactory {
	
	@Produces
	@MessageType(MessageTypes.EMAIL)
	@DisposeMessageSender
	public MessageSender getEmailMessageSender() {
		return new EmailMessageSender();
	}
	@Produces
	@MessageType(MessageTypes.SMS)
	@DisposeMessageSender
	public MessageSender getSmsMessageSender() {
		return new SmsMessageSender();
	}
	@Produces
	@MessageType(MessageTypes.JMS)
	@DisposeMessageSender
	public MessageSender getJmsMessageSender() {
		return new JmsMessageSender();
	}
	
	public void disposes(@Disposes @DisposeMessageSender MessageSender messageSender) {
		
	}
}