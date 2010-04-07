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

import java.lang.reflect.Type;

import com.strategicgains.dto.DataTransferObject;

/**
 * Deserializes a previously serialized DTO model (e.g. a JSON or XML string) into a Model
 * 
 * @author Todd Fredrich
 * @since Mar 30, 2010
 */
public interface Deserializer
{
	public DataTransferObject deserialize(Object serialized, Type type)
	throws DeserializationException;
}
