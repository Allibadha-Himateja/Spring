package com.iss.spring1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.iss.spring1.Models.*;

public class injection2 {
    public static void main(String args[])
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("InnerBeans&ByType,ByName1,2.xml");

        Drawing drawing = (Drawing) context.getBean("drawing");
        drawing.draw();

//        Drawing drawing2 = (Drawing) context.getBean("drawing2");
//        drawing2.draw();
        //this was autowire byType directly taking all the Shape extended objects into the list
    }
}
