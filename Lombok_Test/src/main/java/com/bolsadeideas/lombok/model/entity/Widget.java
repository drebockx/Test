package com.bolsadeideas.lombok.model.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Widget {

	private final String name;
	private final int id;
	
	
}
