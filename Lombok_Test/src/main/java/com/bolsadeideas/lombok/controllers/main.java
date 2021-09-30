package com.bolsadeideas.lombok.controllers;

import com.bolsadeideas.lombok.model.entity.Widget;

public class main {
	public static void main(String[] args) {
		
		Widget testWidget = Widget.builder()
				.name("foo")
				.id(1)
				.build();

		System.out.println("Nombre = " + testWidget.getName() + " id: " + testWidget.getId());
	}

}
