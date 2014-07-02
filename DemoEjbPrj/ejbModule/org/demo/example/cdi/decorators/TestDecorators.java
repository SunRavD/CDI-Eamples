package org.demo.example.cdi.decorators;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
@Model
public class TestDecorators {
	
	@Inject
	private MemberRegisterService memberRegisterService;
	@Inject
	private MemberModelBean member;
	
	public void register() {
		try {
			memberRegisterService.register(member);
		} catch (Exception e) {
			// handling the error message
		}
	}
	

}
