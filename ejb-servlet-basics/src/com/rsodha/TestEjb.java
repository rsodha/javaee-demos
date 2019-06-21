package com.rsodha;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class TestEjb
 */
@Stateless
@LocalBean
public class TestEjb {
	public String sayHello(String name) {
		return "Hello, " + name + "!";
	}
}
