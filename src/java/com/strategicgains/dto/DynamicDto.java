/*
 * Copyright 2010, Strategic Gains, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.strategicgains.dto;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Todd Fredrich
 * @since Mar 30, 2010
 */
public class DynamicDto
{
	// SECTION: CONSTANTS

	private static final String DEFAULT_NAME = "DTO";
	private static final String ARRAY_INDEX_REGEX = "(\\w*)\\[(\\d)\\]";
	private static final Pattern ARRAY_INDEX_PATTERN = Pattern.compile(ARRAY_INDEX_REGEX);


	// SECTION: INSTANCE VARIABLES

	private String name;
	private Map<String, Object> attributes = new HashMap<String, Object>();


	// SECTION: CONSTRUCTORS

	public DynamicDto()
	{
		this(DEFAULT_NAME);
	}

	/**
	 * @param name
	 *            the name of this model.
	 */
	public DynamicDto(String name)
	{
		super();
		setName(name);
	}


	// SECTION: NAME ACCESSORS/MUTATORS

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}


	// SECTION: ATTRIBUTE ACCESSING

	public void setAttribute(String name, Object value)
	{
		attributes.put(name, value);
	}

	public Map<String, Object> attributes()
	{
		return Collections.unmodifiableMap(attributes);
	}
	
	public Set<Entry<String, Object>> entrySet()
	{
		return attributes.entrySet();
	}

	/**
	 * Dto.get("a.b.c");
	 * Dto.get("a[0].b.c);
	 * 
	 * @param query
	 * @return
	 */
	public Object get(String query)
	{
		if (query == null || query.trim().isEmpty()) return null;
		
		String[] keys = query.split("\\.");
		Object value = attributes;

		for (String key : keys)
		{
			value = retrieveValue(key, value);
		}
		
		return value;
	}

	public void set(String query, Object value)
	{
		if (query == null || query.trim().isEmpty()) return;
		
		String[] keys = query.split("\\.");
		Object attribute = attributes;

		for (int i = 0; i < keys.length - 1; ++i)
		{
			attribute = retrieveValue(keys[i], attribute);
		}
		
		// set the new value on the attribute (which is the parent at this point).
	}

	private Object retrieveValue(String querySegment, Object object)
    {
	    boolean isArray = false;
	    int index = 0;
	    Matcher m = ARRAY_INDEX_PATTERN.matcher(querySegment);
	    String key = querySegment;

	    if (m.matches())
	    {
	    	isArray = true;
	    	key = m.group(1);
	    	index = Integer.parseInt(m.group(2));
	    }

	    Object property = null;

	    if (Map.class.isAssignableFrom(object.getClass()))
	    {
	    	property = ((Map) object).get(key);
	    }
	    else
	    {
		    try
	        {
		    	Field f = object.getClass().getDeclaredField(key);
		    	f.setAccessible(true);
		        property = f.get(object);
	        }
	        catch (Exception e)
	        {
	        	throw new UndefinedException(querySegment, e);
	        }
	    }

	    if (!isArray) return property;

	    if (property.getClass().isArray())
	    {
	    	return ((Object[]) property)[index];
	    }

	    if (Collection.class.isAssignableFrom(property.getClass()))
	    {
	    	return ((Collection) property).toArray()[index];
	    }

	    throw new UndefinedException(querySegment);
    }
}
