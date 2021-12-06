package com.strategicgains.dto;

import java.util.UUID;

import com.strategicgains.dto.ReleaseTransformer.ReleaseAssignment;

public class ReleaseTransformer
implements Transformer<ReleaseAssignment, Release>
{
	public class ReleaseAssignment
	{
		public UUID id;
		public String name;
	}

	@Override
	public Release fromDtoValue(ReleaseAssignment dto)
	{
		Release r = new Release(dto.id);
		r.setName(dto.name);
		return r;
	}

	@Override
	public ReleaseAssignment toDtoValue(Release out)
	{
		ReleaseAssignment ra = new ReleaseAssignment();
		ra.id = out.getId();
		ra.name = out.getName();
		return ra;
	}
}
