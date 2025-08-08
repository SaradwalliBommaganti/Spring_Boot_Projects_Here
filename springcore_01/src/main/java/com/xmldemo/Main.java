package com.xmldemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xmldemo.service.GreetingServiceHere;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
          ApplicationContext context =
                new ClassPathXmlApplicationContext("configApp.xml");

        GreetingServiceHere service1 = context.getBean("greetingService", GreetingServiceHere.class);
        GreetingServiceHere service2 = context.getBean("greetingService", GreetingServiceHere.class);

        service1.greet("Sri Yuva Teja Manikanta");
        System.out.println("Service1: " + service1.getClass().getName());
        System.out.println(service1.hashCode());

        service2.greet("saradhwalli");
        System.out.println("Service2: " + service2.getClass().getName());
        System.out.println(service2.hashCode());
        
    }
}