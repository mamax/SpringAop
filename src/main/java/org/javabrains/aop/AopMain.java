package org.javabrains.aop;

import org.javabrains.aop.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
//        System.out.println(shapeService.getCircle().getName());
        Service ss = (Service) context.getBean("service");
        ss.printoutStructure();
    }
}
