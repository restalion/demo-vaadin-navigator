package com.restalion.sample.demovaadinnavigator;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;

@SpringComponent
@ViewScope
public class Greeter {

	public String sayHello() {
		return "Hello! " + this.toString();
	}
}
