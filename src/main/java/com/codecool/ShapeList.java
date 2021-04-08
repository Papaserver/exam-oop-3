package com.codecool;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ShapeList {

    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape newShape) {
        shapes.add(newShape);
    }

    public Shape getLargest() {
        if (shapes.size() > 0) {
            return shapes.stream().max(Comparator.comparingInt(Shape::getArea)).get();
        }
        return null;
    }

    public String compareArea(Shape firstShape, Shape secondShape) {
        if (firstShape.getArea() == secondShape.getArea()) {
            return "Equal areas";
        }
        return firstShape.getArea() > secondShape.getArea() ? firstShape.speak() : secondShape.speak();
    }
}
