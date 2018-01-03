package com.lin.luo.tian;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Initializer {
	private static final ClassPathXmlApplicationContext cpac;
	
	static {
		cpac = new ClassPathXmlApplicationContext("classpath:springmodule.xml");
	}

	public static ClassPathXmlApplicationContext getCpac() {
		return cpac;
	}
	
}
