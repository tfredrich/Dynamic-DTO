package com.strategicgains.dto;

import java.util.UUID;

public class Release
extends Base
{
	private String name;
	private String description;

	public Release()
	{
		super();
	}

	public Release(UUID id)
	{
		super(id);
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getName()
	{
		return name;
	}

	public boolean hasName()
	{
		return (name != null);
	}

	public String getDescription()
	{
		return description;
	}

	public boolean hasDescription()
	{
		return (description != null);
	}
}
