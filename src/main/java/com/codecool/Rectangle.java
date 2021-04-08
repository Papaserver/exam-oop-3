package com.codecool;

public class Rectangle extends Shape{

    private int sideA;
    private int sideB;
    private int side;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        setArea();
    }

    public Rectangle(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public String speak() {
        return "I'm a rectangle";
    }

    @Override
    public void setArea() {
        super.area = sideA * sideB;
    }
}
