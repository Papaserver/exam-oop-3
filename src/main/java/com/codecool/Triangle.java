package com.codecool;

public class Triangle extends Shape{

    private int base;
    private int baseHeight;

    public Triangle(int base, int baseHeight) {
        this.base = base;
        this.baseHeight = baseHeight;
        setArea();
    }

    @Override
    public String speak() {
        return "I'm a triangle";
    }

    @Override
    public void setArea() {
        super.area = base * baseHeight / 2;
    }
}
