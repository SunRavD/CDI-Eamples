package org.demo.example.cdi.interceptors;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.AroundTimeout;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

public class TransactionInterceptor {

	/**
	 * A business method interceptor applies to invocations of methods of the
	 * bean by clients of the bean:
	 */
	@AroundInvoke
	public Object processMethodInvocation(InvocationContext context)
			throws Exception {
		// some logic ...

		return context.proceed();
	}

	/**
	 * A lifecycle callback interceptor applies to invocations of lifecycle
	 * callbacks by the container
	 */
	@PostConstruct
	public void postConstructMethodInvocation(InvocationContext aContext)
			throws Exception {

		/**
		 * from getTarget method,
		 */
		if (aContext.getTarget() instanceof Bean1) {
			Bean1 bean = (Bean1) aContext.getTarget();
			bean.setRandom(new Random().nextLong());

		}

		aContext.proceed();
	}

	public class Bean1 {

		private Long random;

		/**
		 * @return the random
		 */
		public Long getRandom() {
			return random;
		}

		/**
		 * @param random
		 *            the random to set
		 */
		public void setRandom(Long random) {
			this.random = random;
		}

	}

	/**
	 * A timeout method interceptor applies to invocations of EJB timeout
	 * methods by the container
	 */
	@AroundTimeout
	public void timeoutMethodInvocation(InvocationContext aContext)
			throws Exception {
		aContext.proceed();
	}
}
