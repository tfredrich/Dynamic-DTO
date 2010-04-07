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

package com.strategicgains.dto.serialization.json;

import static com.strategicgains.util.date.DateAdapterConstants.TIMESTAMP_OUTPUT_FORMAT;

import java.lang.reflect.Type;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.strategicgains.dto.DataTransferObject;
import com.strategicgains.dto.serialization.DeserializationException;
import com.strategicgains.dto.serialization.Deserializer;
import com.strategicgains.dto.serialization.SerializationException;
import com.strategicgains.dto.serialization.Serializer;

/**
 * JsonProcessor handles serialization from/to JSON using the Google GSON library.
 * 
 * @author Todd Fredrich
 * @since Mar 30, 2010
 */
public class JsonProcessor
implements Serializer, Deserializer
{
	// SECTION: INSTANCE VARIABLES

	private Gson gson;

	
	// SECTION: CONSTRUCTORS
	
	public JsonProcessor()
	{
		this(new GsonBuilder()
			.disableHtmlEscaping()
			.registerTypeAdapter(Date.class, new GsonTimestampSerializer())
			.setDateFormat(TIMESTAMP_OUTPUT_FORMAT)
			.create());
	}
	
	public JsonProcessor(Gson gson)
	{
		this.gson = gson;
	}


	// SECTION: DESERIALIZATION

	@Override
	public DataTransferObject deserialize(Object serialized, Type type)
	throws DeserializationException
	{
		return gson.fromJson((String) serialized, type);
	}

	
	// SECTION: SERIALIZATION

	@Override
	public Object serialize(DataTransferObject model)
	throws SerializationException
	{
		return gson.toJson(model);
	}
}
