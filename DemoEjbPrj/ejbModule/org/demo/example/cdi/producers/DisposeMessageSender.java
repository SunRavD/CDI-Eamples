package org.demo.example.cdi.producers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;


@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD,ElementType.PARAMETER,ElementType.FIELD,ElementType.TYPE})
public @interface DisposeMessageSender {

}
