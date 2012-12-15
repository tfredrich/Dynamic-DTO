package com.strategicgains.dto;

import com.strategicgains.dto.builder.DtoBuilder;
import com.strategicgains.dto.select.SelectQuery;

public final class DTO
{
	public static final SelectQuery select()
	{
		return new SelectQuery();
	}

	public static final SelectQuery select(String query)
	{
		return new SelectQuery(query);
	}
	
	public static final DtoBuilder builder()
	{
		return new DtoBuilder();
	}
}
