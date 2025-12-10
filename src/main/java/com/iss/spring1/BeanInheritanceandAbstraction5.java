package com.iss.spring1;

import com.iss.spring1.Models.Drawing;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInheritanceandAbstraction5 {
    public static void main(String[] args)
    {
        // let us assume a scenario where we have two bean which are partial
        // assuming that we have two bean those are rectangle bean with property mappings
        // and those two bean are
        // <bean class="" name="rectangle">
        //      <property name="length" value="100"></>
        // </bean>
        // <bean class="" name="rectangle2">
        //      <property name="breadth" value="50"></>
        // </bean>

        // FOR IMPLEMENTING THE Bean Defination inheritance we have to
        // USE THE parent property for the beans
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("BeanInheritance&Abstraction5.xml");

        Drawing drawing=applicationContext.getBean("drawing2",Drawing.class);
        drawing.draw();
        // for combining the two list beans we have to mention one ke attribute
        // merge="true"  <list merge="true">

        // what do i mean by abstraction
        // abstracting the bean means creating a bean without the class property and using that bean as a template for other beans
        // assume we are taking a bean
        // <bean name="rectangle" abstract="true">
        //      <property name="length" value="100"></>
        //      <property name="breadth" value="50"></>
        // </bean>

        //  we can use this template in actual beans
        // <bean class="com.iss.Spring1.Models.Rectangle" name="rectangle2" parent="rectangle"></bean>



    }
}
