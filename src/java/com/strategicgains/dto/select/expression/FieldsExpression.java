package com.strategicgains.dto.select.expression;

import java.util.ArrayList;
import java.util.List;

public class FieldsExpression
implements Expression
{
	private List<Expression> accessors = new ArrayList<Expression>();

	public FieldsExpression(String... names)
    {
		super();
		
		for (String name : names)
		{
			accessors.add(new FieldExpression(name));
		}
    }

	@Override
	public Object evaluate(Object argument)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
