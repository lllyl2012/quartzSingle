package com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyQuartz {
	ApplicationContext acApplicationContext;
	@Test
	public void init(){
		acApplicationContext = new ClassPathXmlApplicationContext("application.xml");
	}
}
