package com.iss.spring1;


/// this is the implementation for how we implement the Dependency injection(Inversion of control)
/// for this example we have implemented a design pattern which is factory pattern
/// there is another design pattern which we need to learn that is Repository pattern
/// the factory pattern is mainly used for abstracting the object creation
/// whereas the Repository pattern will handle the object operations such as CRUD

//interface Shape
//{
//    public void draw();
//}
//class Circle implements Shape
//{
//    @Override
//    public void draw()
//    {
//        System.out.println("Drawing Circle");
//    }
//}
//class Rectangle implements Shape
//{
//    @Override
//    public void draw()
//    {
//        System.out.println("Drawing Rectangle");
//    }
//}
//class Drawing
//{
//    private Shape shape;
//    public void setShape(Shape shape)
//    {
//        this.shape = shape;
//    }
//    public Shape getShape()
//    {
//        return shape;
//    }
//    public Shape getShape(String type)
//    {
//        switch (type)
//        {
//            case "Circle":
//                return new Circle();
//            case "Rectangle":
//                return new Rectangle();
//            default:
//                return null;
//        }
//    }
//    public void draw()
//    {
//        shape.draw();
//    }
//}

///  this below is the example for the repository pattern
/// public class Student
/// {
///     private int sid;
///     private String sname;
///     private double fees;
///     //getters and setters;
///     //AllArgsConstructor
///     //NoArgsConstructor
/// }
/// interface IStudentRepository
/// {
///     public List<Student> getAllStudents();
///     public Student addStudent();
///     public List<Student> deleteStudent();
///     public Student updateStudent();
/// }
/// public class StudentRepository implements IStudentRepository
/// {
///     //ovverride all the methods in the interface
/// }
/// class program
/// {
///     public static void main(String args[])
///     {
///             StudentRepository s=new StudentRepository();
///             r.addStudent(new Student())..........etc
///
///             r.update/delete/getAllStudents();;;;;;
///     }
/// }
//
//public class WhySpring {
//    public static void main(String[] args) {
//        Shape shape = new Circle();
//        shape.draw();
//
//        shape = new Rectangle();
//        shape.draw();
//
//        Drawing drawing = new Drawing();
//        drawing.setShape(new Rectangle());// for factory pattern instead we use the String type param method
//        drawing.draw();
//
//        drawing.setShape(new Circle());
//        drawing.draw();
//
//    }
//}
