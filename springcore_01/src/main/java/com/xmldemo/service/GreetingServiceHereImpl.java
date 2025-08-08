package com.xmldemo.service;

public class GreetingServiceHereImpl implements GreetingServiceHere {

   
    private String message;
    private String name;

    // Constructor for dependency injection
    public GreetingServiceHereImpl(String message, String name) {
        this.message = message;
        this.name = name;
    }

    public void greet(String name) {
        System.out.println(message + ", " + name + "!");
    }

}
