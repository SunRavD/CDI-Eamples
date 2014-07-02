package org.demo.example.cdi.alternates;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Stereotype;

/**
 * 
 * @author sunkarar
 * 
 * 
 * <alternates>
 * 	<stereotypeclass>org.demo.example.cdi.alternates.Card</stereotypeclass>
 * </alternates>
 *
 */


@Stereotype
@Target(value={ElementType.ANNOTATION_TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Alternative
public @interface Card {
	CardType[] cardType();
}
