package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml"); //Represents IOC Container : Manages Bean Lifecycle)
        Student std1 = (Student)context.getBean("student1");
        Student std2 = (Student)context.getBean("student2");
        Student std3 = (Student)context.getBean("student3");
        
        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std3);
    }
}
