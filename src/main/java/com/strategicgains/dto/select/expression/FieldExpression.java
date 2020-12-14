package com.strategicgains.dto.select.expression;

import java.lang.reflect.Field;
import java.util.Map;

import com.strategicgains.dto.UndefinedException;

/**
 * @author toddf
 * @since Dec 14, 2012
 */
public class FieldExpression
implements Expression
{
	private String name;

	public FieldExpression(String name)
    {
		super();
		this.name = name;
    }

    @Override
    @SuppressWarnings("rawtypes")
	public Object evaluate(Object argument)
	{
	    if (Map.class.isAssignableFrom(argument.getClass()))
	    {
	    	return ((Map) argument).get(name);
	    }
	    else
	    {
		    try
	        {
		    	Field f = argument.getClass().getDeclaredField(name);
		    	f.setAccessible(true);
		        return f.get(argument);
	        }
	        catch (Exception e)
	        {
	        	throw new UndefinedException(name, e);
	        }
	    }
	}
}
