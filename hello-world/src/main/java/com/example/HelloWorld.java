package com.example;

public class HelloWorld {
    public String sayHello() {
        return "Hello, World!";
    }

    public String getPassword() {
        return "12345";
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.sayHello());
    }
}
