package org.javabrains.aop.service;

import lombok.Data;
import org.javabrains.aop.model.Circle;
import org.javabrains.aop.model.Triangle;

@Data
public class ShapeService {

    private Circle circle;
    private Triangle triangle;

}
