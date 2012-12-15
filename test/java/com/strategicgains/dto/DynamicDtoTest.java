package com.strategicgains.dto;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class DynamicDtoTest
{
	@Test
	public void shouldRetrieveSingleInstance()
	{
		DynamicDto dto = new DynamicDto();
		dto.setAttribute("top", "single instance");
		dto.setAttribute("another", "another value");

		assertEquals("single instance", dto.get("top"));
	}

	@Test
	public void shouldRetrieveRawList()
	{
		DynamicDto dto = new DynamicDto();
		dto.setAttribute("top", new ArrayList<String>(Arrays.asList("one", "two", "three")));
		dto.setAttribute("another", "another value");

		List<String> l = (List<String>) dto.get("top");
		assertEquals("one", l.get(0));
		assertEquals("two", l.get(1));
		assertEquals("three", l.get(2));
	}

	@Test
	public void shouldRetrieveRawListIndex()
	{
		DynamicDto dto = new DynamicDto();
		dto.setAttribute("top", new ArrayList<String>(Arrays.asList("one", "two", "three")));
		dto.setAttribute("another", "another value");

		assertEquals("one", dto.get("top[0]"));
		assertEquals("two", dto.get("top[1]"));
		assertEquals("three", dto.get("top[2]"));
	}

	@Test
	public void shouldRetrieveRawArray()
	{
		DynamicDto dto = new DynamicDto();
		dto.setAttribute("top", new String[] {"one", "two", "three"});
		dto.setAttribute("another", "another value");

		String[] l = (String[]) dto.get("top");
		assertEquals("one", l[0]);
		assertEquals("two", l[1]);
		assertEquals("three", l[2]);
	}

	@Test
	public void shouldRetrieveRawArrayIndex()
	{
		DynamicDto dto = new DynamicDto();
		dto.setAttribute("top", new String[] {"one", "two", "three"});
		dto.setAttribute("another", "another value");

		assertEquals("one", dto.get("top[0]"));
		assertEquals("two", dto.get("top[1]"));
		assertEquals("three", dto.get("top[2]"));
	}

	@Test
	public void shouldRetrieveFieldValue()
	{
		DynamicDto dto = new DynamicDto();
		dto.setAttribute("top", new InnerClass("foo"));
		dto.setAttribute("another", "another value");

		assertEquals("foo", dto.get("top.embedded"));
	}

	@Test
	public void shouldRetrieveEmbeddedArrayValue()
	{
		DynamicDto dto = new DynamicDto();
		dto.setAttribute("top", new InnerClass(new String[] {"foo", "bar", "bat"}));
		dto.setAttribute("another", "another value");

		assertEquals("foo", dto.get("top.embedded[0]"));
		assertEquals("bar", dto.get("top.embedded[1]"));
		assertEquals("bat", dto.get("top.embedded[2]"));
	}

	@Test
	public void shouldRetrieveEmbeddedMapValue()
	{
		DynamicDto dto = new DynamicDto();
		Map m = new HashMap();
		m.put("foo", new String[] {"bar", "bat"});
		m.put("bar", new InnerClass(new String[] {"foo", "bar", "bat"}));
		dto.setAttribute("top", m);
		dto.setAttribute("another", "another value");

		assertEquals("bar", dto.get("top.foo[0]"));
		assertEquals("bat", dto.get("top.foo[1]"));
		assertEquals("foo", dto.get("top.bar.embedded[0]"));
		assertEquals("bar", dto.get("top.bar.embedded[1]"));
		assertEquals("bat", dto.get("top.bar.embedded[2]"));
	}
	
	public class InnerClass
	{
		private Object embedded;

		public InnerClass(Object value)
		{
			this.embedded = value;
		}
	}
}
