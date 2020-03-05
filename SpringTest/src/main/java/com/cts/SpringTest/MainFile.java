package com.cts.SpringTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFile {
	public static void main(String []args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("desc.xml");
		Employee emp=(Employee)context.getBean("employee");
		emp.e1();
	}

}
