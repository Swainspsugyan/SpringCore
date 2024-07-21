package com.spring.SpringCore01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Hello SP");
    	ApplicationContext context  = new ClassPathXmlApplicationContext("config.xml");
    	
    	StudentBean student = (StudentBean) context.getBean("studentBean01");
    	
    	System.out.println(student);
    
    }
}
