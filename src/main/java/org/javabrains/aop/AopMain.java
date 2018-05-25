package org.javabrains.aop;

import org.javabrains.aop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
        System.out.println(shapeService.getCircle().getName());

    }
}
