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

package com.strategicgains.dto.serialization;

import com.strategicgains.dto.Model;

/**
 * A SerlializationProcessor can handle both serialization and deserialization.
 * 
 * @author toddf
 * @since Mar 30, 2010
 */
public class SerializationProcessor
implements Serializer, Deserializer
{
	// SECTION: INSTANCE VARIABLES

	private Serializer serializer;
	private Deserializer deserializer;

	
	// SECTION: CONSTRUCTORS

	/**
	 * @param serializer
	 * @param deserializer
	 */
	public SerializationProcessor(Serializer serializer, Deserializer deserializer)
	{
		super();
		this.serializer = serializer;
		this.deserializer = deserializer;
	}

	
	// SECTION: DESERIALIZER

	@Override
	public Model deserialize(Object serialized)
	throws DeserializationException
	{
		return deserializer.deserialize(serialized);
	}


	// SECTION: SERIALIZER

	@Override
	public Object serialize(Model model)
	throws SerializationException
	{
		return serializer.serialize(model);
	}
}
