package com.fdm.TestSpringStuff;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import foo.Robot;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// dummy change
		
		ApplicationContext ac =
			new ClassPathXmlApplicationContext("springcfg.xml");
	
	    Robot rx = ac.getBean("robbie", foo.Robot.class);
	    System.out.println(rx.hashCode());
	  
	    rx = ac.getBean("robbie", foo.Robot.class);
	    System.out.println(rx.hashCode());
	  
	    
	}
}
