package org.demo.example;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Session Bean implementation class HelloBean
 */
@Stateless
@LocalBean
public class HelloBean implements HelloBeanRemote, HelloBeanLocal {

	
	public void showMessage() {
		System.out.println(" Enter the jkjfsdkjfkjsdkfj");
	}


}
