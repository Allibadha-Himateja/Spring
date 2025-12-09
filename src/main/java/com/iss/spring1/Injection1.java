package com.iss.spring1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.iss.spring1.Models.*;
/// for creating a spring application from scratch we have to make sure we follow some rules
/// create a simple java project
/// we have to add the spring libraries into the classpath
/// we have to make sure we are having all the neccasary spring jars
/// the following are the necassary jars:
/// commons-logging-1.3.5
/// spring-aop-7.0.0-M8
/// spring-beans-7.0.0-M8
/// spring-context-7.0.0-M8
/// spring-core-7.0.0-M8
/// spring-expression-7.0.0-M8
/// spring-web-7.0.0-M8
/// THEN CREATE A CLASS WHICH IS THE BELOW CLASS
public class Injection1 {
    public static void main(String args[])
    {
        // so for the traditional application they were using the BeanFactory
        // but for the best practises we have to use the ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("InnerBeans&ByType,ByName.xml");
        // for the creation of the xml configuration file we have to create that
        // src/main/resources,Property&Constructor.xml
        // NOTE: when we create a xml file from scratch we have to give the xml namespace......<?xmlversion....?
        // checkout the xml configuration for bean configuration...


//        Shape shape = (Shape) context.getBean("rectangle");
//        shape.draw();
        // Drawing rectangle

        Drawing drawing = (Drawing) context.getBean("drawing");
        //when creating this Drawing class bean we are actually injecting the circle class instance into Shape Object
        drawing.draw();
        // here comes the Drawing Circle

        //how about we do the value-based property injection for circle(radius property)
        //similarly we can able to injection the values through contructor injection for the Rectangle Bean

        // SOME EXCEPTIONS IN DEPENDENCY INJECTION
        // those are types of injections not the methods of injection
        // injection by type and by Name
        // when we are having two bean with same type and dependent bean doesn't know which one to inject
        // this is type based injection issue
        //<bean class="com.iss.Spring1.Models.Drawing" name="drawing">
        //  <constructor-args name="shape" type="com.iss.Spring1.Models.Shape"></constructor-args>
        //</bean>

        // it will injection the first matching type bean parsing from top to bottom it will injection the first created bean
        // inside the bean container
        // like if we changed the type from com.iss.Spring1.Models.Shape to com.iss.Spring1.Models.Rectangle always only the rectangle is injected to the Drawing bean
        // BUTT THIS WAS WRONG WE HAVE TO USE autowire property

//      //<bean class="com.iss.Spring1.Models.Drawing" name="drawing" autowire="byType/byName/constructor/default/no">
//      //
//      //</bean>


    }
}
