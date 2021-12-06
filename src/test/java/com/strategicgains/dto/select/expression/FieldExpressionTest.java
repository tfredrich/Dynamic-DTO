/*
    Copyright 2012, Strategic Gains, Inc.

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package com.strategicgains.dto.select.expression;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * @author toddf
 * @since Dec 14, 2012
 */
public class FieldExpressionTest
{
	@Test
	public void shouldGetStringValue()
	{
		InnerClass c = new InnerClass("foo");
		Expression e = new FieldExpression("embedded");
		assertEquals("foo", e.evaluate(c));
	}

	@Test
	public void shouldGetArrayValue()
	{
		InnerClass c = new InnerClass(new String[] {"one", "two", "three"});
		Expression e = new FieldExpression("embedded");
		String[] s = (String[]) e.evaluate(c);
		assertEquals("one", s[0]);
		assertEquals("two", s[1]);
		assertEquals("three", s[2]);
	}

	@Test
	public void shouldGetMapValue()
	{
		Map m = new HashMap();
		m.put("foo", "me");
		m.put("bar", "bat");
		Expression e = new FieldExpression("bar");
		assertEquals("bat", e.evaluate(m));
	}
	
	private class InnerClass
	{
		private Object embedded;
		
		public InnerClass(Object value)
		{
			this.embedded = value;
		}
	}
}
