package com.lin.luo.tian;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext cpac = Initializer.getCpac();
		//System.out.println("Sleeping for 2 s");
		//Thread.sleep(2000);
		Father fa = (Father) cpac.getBean("father");
		//System.out.println("Sleeping for 5 s");
		//Thread.sleep(5000);
		//fa.start();
		
		System.out.println(fa.getTool());
		System.out.println(fa.getTool());
		
		Son son = (Son) cpac.getBean("son");
		System.out.println(son.getTool());
		System.out.println(son.getTool());
	}
}
