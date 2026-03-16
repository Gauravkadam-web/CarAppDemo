package com.stackninjas;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Car car = context.getBean("car", Car.class);
        System.out.println(car);
        car.drive();

//        Car car1 = context.getBean("car1",Car.class);
//        System.out.println(car1);
//        car1.drive();
    }
}
