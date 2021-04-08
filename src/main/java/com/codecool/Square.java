package com.codecool;

public class Square extends Rectangle{

    private int side;

    public Square(int side) {
        super(side);
        setArea();
    }

    @Override
    public String speak() {
        return "I'm a square";
    }

    @Override
    public void setArea() {
        super.area = getSide() * getSide();
    }
}
