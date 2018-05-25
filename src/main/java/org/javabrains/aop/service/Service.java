package org.javabrains.aop.service;

import java.util.List;
import java.util.Map;

public class Service {

    public Service(Map<String, List<String>> names) {
        this.names = names;
    }

    private Map<String, List<String>> names;

    public void printoutStructure(){
        for (Map.Entry entry : names.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
