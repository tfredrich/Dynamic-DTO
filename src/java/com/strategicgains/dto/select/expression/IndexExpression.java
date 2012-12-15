package com.strategicgains.dto.select.expression;

import java.util.Collection;

/**
 * @author toddf
 * @since Dec 14, 2012
 */
public class IndexExpression
implements Expression
{
	private int index;

	public IndexExpression(int index)
    {
		super();
		this.index = index;
    }

    @Override
    @SuppressWarnings("rawtypes")
	public Object evaluate(Object argument)
	{
	    if (argument.getClass().isArray())
	    {
	    	return ((Object[]) argument)[index];
	    }

	    if (Collection.class.isAssignableFrom(argument.getClass()))
	    {
	    	return ((Collection) argument).toArray()[index];
	    }

	    throw new ArrayIndexOutOfBoundsException(index);
	}
}
