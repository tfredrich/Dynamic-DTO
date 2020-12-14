package com.strategicgains.dto;

public interface Transformer<I, O>
{
	O fromDtoValue(I dtoValue);
	I toDtoValue(O out);
}
