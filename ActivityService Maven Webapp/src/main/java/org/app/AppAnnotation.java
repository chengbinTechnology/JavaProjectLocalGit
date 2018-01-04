package org.app;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) 
@Target({ElementType.METHOD}) 
public @interface AppAnnotation {
    //level 分为PUBLIC,PROTECTED,PRIVATE
	public String level() default "PROTECTED";

}
