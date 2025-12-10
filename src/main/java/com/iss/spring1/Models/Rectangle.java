package com.iss.spring1.Models;

public class Rectangle implements Shape {

    private int length,breadth;
//    public Rectangle(int length,int breadth){
//        this.length=length;
//        this.breadth=breadth;
//    }
    public void init(){
        System.out.println("init is called for Rectangle");
    }
    public void destroy(){
        System.out.println("destroy is called for Rectangle");
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }

    public void draw() {
        System.out.println("Drawing Rectangle "+length+" "+breadth+" hashcode"+ this.hashCode());
    }
}
