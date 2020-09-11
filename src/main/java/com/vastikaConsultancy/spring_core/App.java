package com.vastikaConsultancy.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-confix.xml");
    	User user = (User)context.getBean("u");
    	user.display();
    	
    }
  
    
}
