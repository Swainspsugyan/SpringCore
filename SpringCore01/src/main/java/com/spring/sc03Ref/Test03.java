package com.spring.sc03Ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context  = new ClassPathXmlApplicationContext("com/spring/sc03ref/refconfig.xml");
		Emp e = (Emp) context.getBean("empref");
		
		System.out.println(e.getX());
		System.out.println(e.getOb().getY());
		
		System.out.println(e);
		
	}

}
