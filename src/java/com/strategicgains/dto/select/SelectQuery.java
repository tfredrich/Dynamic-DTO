package com.strategicgains.dto.select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.strategicgains.dto.select.expression.FieldExpression;
import com.strategicgains.dto.select.expression.Expression;
import com.strategicgains.dto.select.expression.FieldsExpression;

public class SelectQuery
{
	private List<Expression> commands;

	public SelectQuery()
    {
		commands = new ArrayList<Expression>();
    }
	
	public SelectQuery(String select)
	{
		if (select == null || select.trim().isEmpty())
		{
			throw new NullPointerException("Empty/Null select string");
		}
		
		String[] keys = select.split("\\.");
	}

	public SelectQuery field(String name)
	{
		commands.add(new FieldExpression(name));
		return this;
	}

	public SelectQuery fields(String... names)
	{
		commands.add(new FieldsExpression(names));
		return this;
	}
	
	public SelectQuery get(int index)
	{
		return this;
	}

	public Map<String, Object> evaluate(Object object)
	{
		return null;
	}
}
