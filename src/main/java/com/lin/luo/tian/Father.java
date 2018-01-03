package com.lin.luo.tian;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Father implements BeanFactoryAware{
	private BeanFactory factory;
	private Tool tool;

	public void start() {
		System.out.println("father....");
	}

	public Tool getTool() {
		return (Tool) factory.getBean("tool");
	}

	public void setTool(Tool tool) {
		this.tool = tool;
	}

	public void setBeanFactory(BeanFactory factory) throws BeansException {
		this.factory = factory;
	}

}
