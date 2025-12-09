package com.iss.spring1.Models;

import java.util.List;

public class Drawing {
//    private Shape shape;
    private List<Shape> shapes;

    public List<Shape> getShapes() {
        return shapes;
    }
    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }

//    public Shape getShape() {
//        return shape;
//    }
//    public void setShape(Shape shape) {
//        this.shape = shape;
//    }
    public void draw(){
//        this.shape.draw();
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
