package com.bolsadeideas.lombok.controllers;

import com.bolsadeideas.lombok.model.entity.Widget;

public class main {
	public static void main(String[] args) {
		
		Widget testWidget = Widget.builder()
				.name("foo")
				.id(1)
				.build();
		
		assertThat(testWidget.getName()).isEqualTo("foo");
		assertThat(testWidget.getId()).isEqualTo(1);
		
	}

}
