package com.springcore.worksheet2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/worksheet2/config.xml");
        //Address a = (Address)context.getBean("add");
        //System.out.println(a);
        
        Student student = (Student)context.getBean("student");
        System.out.println(student);
    }
}
