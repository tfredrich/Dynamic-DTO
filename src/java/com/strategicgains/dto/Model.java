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

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * @author toddf
 * @since Mar 30, 2010
 */
public class Model
{
	// SECTION: CONSTANTS

	private static final String DEFAULT_NAME = "Model";


	// SECTION: INSTANCE VARIABLES

	private String name;
	private Map<String, Object> attributes = new HashMap<String, Object>();


	// SECTION: CONSTRUCTORS

	public Model()
	{
		this(DEFAULT_NAME);
	}

	/**
	 * @param name
	 *            the name of this model.
	 */
	public Model(String name)
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

	public Map<String, Object> attributes()
	{
		return Collections.unmodifiableMap(attributes);
	}
	
	public Set<Entry<String, Object>> entrySet()
	{
		return attributes.entrySet();
	}

	public Object get(String key)
	{
		return attributes.get(key);
	}

	public Object get(String key, Type type)
	{
		return attributes.get(key);
	}

	public Object set(String key, Object value)
	{
		return attributes.put(key, value);
	}

	public Object remove(String key)
	{
		return attributes.remove(key);
	}
}
