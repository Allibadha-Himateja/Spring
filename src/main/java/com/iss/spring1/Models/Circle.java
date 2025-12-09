package com.iss.spring1.Models;

public class Circle implements Shape {

    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public void draw() {
        System.out.println("Drawing Circle "+radius);
    }
}
