package com.iss.spring1.Models;

public class Rectangle implements Shape {

    private int length,breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public void draw() {
        System.out.println("Drawing Rectangle "+length+" "+breadth);
    }
}
