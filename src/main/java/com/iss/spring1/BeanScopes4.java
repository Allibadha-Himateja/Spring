package com.iss.spring1;

import com.iss.spring1.Models.Circle;
import com.iss.spring1.Models.Drawing;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopes4 {
    public static void main(String[] args)
    {
        // in order to check the scopes of bean injection we have to make sure we take the hashcode
        // inside the Circle and Rectangle draw method....
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanScopes4.xml");

//        Drawing drawing = (Drawing)context.getBean("drawing");
//        drawing.draw();
//        Circle circle = (Circle)context.getBean("circle");
//        circle.draw();

        // for this hascode testing we are logging
        // Drawing Rectangle 50 30 hashcode1661406123
        // Drawing Circle 20 hashcode282496973
        // Drawing Circle 20 hashcode282496973

        // shows the circle is only created once with a single hashcode
        // this injection scope is SINGLETION
        // means EVERY BEAN BY DEFAULT WILL BE INJECTED INTO BEAN CONTAINER ONLY ONCE AND WILL BE SHARED TO ALL THE DEPENDENCIES
        // WITH SAME INSTANCE Like Circle

        // FUNDAMENTALLY WE ARE HAVING TWO commonly used TYPES OF SCOPES
        // 1)singleton
        // 2)prototype
        // other then them we have session,request and global session

        // for manually setting the bean creation from singleton to prototype we have to use the scope attribute
        // <bean class="" name="" scope="prototype"></bean>
        // now for exceptions

        Circle circle = (Circle) context.getBean("circle");
        circle.setRadius(15);
        circle.draw();
        // here we are setting the singleton bean with a setter
        // that means the only Circle instance inside the beanContainer will be changed
        // for not that to happen we have make sure to use the scope="prototype" inside the circle bean

        //similarly when we try to make changes from any APPLICATIONCONTEXT AWARE bean with a singleton scope
        // that will manipulate all the singleton bean
        Drawing drawing = (Drawing) context.getBean("drawing");
        drawing.draw();

    }
}
