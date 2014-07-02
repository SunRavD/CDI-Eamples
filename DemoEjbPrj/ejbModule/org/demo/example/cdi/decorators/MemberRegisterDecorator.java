package org.demo.example.cdi.decorators;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;


/**
 * 
 *Define this in beans.xml 
 *<decorators>
 *	<class>org.demo.example.cdi.decorators.MemberRegisterDecorator</class>
 *</decorators>
 *
 */
@Decorator
public class MemberRegisterDecorator implements IMemberRegistering{

	@Inject
	@Delegate
	@Any
	private MemberRegisterService memberRegisterService;
	@Override
	public void register(MemberModelBean member) throws Exception {
		if(member.getCountryCode().equals("PAK")) {
			throw new Exception("Unable to register you.. ");
		}
		memberRegisterService.register(member);
	}

}
