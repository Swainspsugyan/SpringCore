package com.spring.sc01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Hello SP");
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	StudentBean student1 = (StudentBean) context.getBean("studentBean01");
    	StudentBean student2 = (StudentBean) context.getBean("studentBean02");
    	StudentBean student3 = (StudentBean) context.getBean("studentBean03");
    	StudentBean student4 = (StudentBean) context.getBean("studentBean04");
    	StudentBean student5 = (StudentBean) context.getBean("studentBean05");
    	StudentBean student6 = (StudentBean) context.getBean("studentBean06");
    	
    	System.out.println(student1);
    	System.out.println(student2);
    	System.out.println(student3);
    	System.out.println(student4);
    	System.out.println(student5);
    	System.out.println(student6);
    	
    	
    	
    }
}
