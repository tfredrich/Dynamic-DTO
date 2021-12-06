package com.strategicgains.dto;

import java.util.Date;

import com.strategicgains.dto.annotation.DtoIgnore;
import com.strategicgains.dto.annotation.DtoTransform;

//@DynamicDto {
//	@DtoIgnore("id")
//}
public class Example
extends Base
{
	private String name;
	private String[] phoneNumbers;

	@DtoTransform(transformer = ReleaseTransformer.class)
	private Release release;

	@DtoIgnore
	private Date createdAt;

	@DtoIgnore
	private Date updatedAt;
}
