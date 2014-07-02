/**
 * 
 */
package org.demo.example.cdi.interceptors;

import java.io.Serializable;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 * @author sunkarar
 *
 */
/**
 * in beans. has to define this class/es of interceptor classes. <pre>
 * <interceptors>
 * <class>org.demo.example.cdi.interceptors</class> </interceptors>
 * </pre>
 */
@TransactionalInvoke
@Interceptor
public class TransactionalInterceptClass implements Serializable {

	private static final long serialVersionUID = 1L;

	@AroundInvoke
	public Object invokeMethodInterceptor(InvocationContext aContext)
			throws Exception {
		System.out.println("......");
		return aContext.proceed();
	}
}
