package com.strategicgains.dto;

import java.util.UUID;

import com.strategicgains.dto.annotation.DtoIgnore;

public class Base
{
	@DtoIgnore
	private UUID id;

	public Base()
	{
		super();
	}

	public Base(UUID id)
	{
		this();
		setId(id);
	}

	public UUID getId()
	{
		return id;
	}

	public boolean hasId()
	{
		return (id != null);
	}

	public void setId(UUID id)
	{
		this.id = id;
	}
}
