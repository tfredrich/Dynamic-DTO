package com.strategicgains.dto.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.strategicgains.dto.Transformer;

@Retention(RUNTIME)
@Target(FIELD)
public @interface DtoTransform
{
	Class<? extends Transformer> transformer();
}
