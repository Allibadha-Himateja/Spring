package com.iss.spring1;

import com.iss.spring1.Models.Drawing;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle6 {

    public void init(){
        System.out.println("init from lifecycle class");
    }
    public void destroy(){
        System.out.println("destroy from lifecycle class");
    }
    public void print(){
        System.out.println("printingg from BeanLifeCycle6");
    }


    public static void main(String args[])
    {
        // THE BEAN LIFECYCLE METHODS WHICH DESCRIBES HOW BEANS ARE CREATED AND DESTROYED
        // two fundamental methods
        // 1) init() method
        // 2) destroy() method
        // init method is called just after the initialization of bean properties to manipulate data.
        // destroy method called when a bean is  no longer  required and the object is ready to decompose
        // this is a clean up activity
        // this below is the example for bean lifecycle methods


        ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("BeanLifeCycle6.xml");
        applicationContext.registerShutdownHook();
//        BeanLifeCycle6 bean=(BeanLifeCycle6)applicationContext.getBean("beanLifeCycle6",BeanLifeCycle6.class);
//        bean.print();

        // the console log for this execution is
        // init from lifecycle class
        // printingg from BeanLifeCycle6
        // There is no Destroy method call

        // for the destroy method call we have to mention a special inside the applicationContext
        // the Simple ApplicationContext wont work for adding the registerShutdownHook() method
        // we have to use the ConfigurableApplicationContext for that

        // and now we can able to see the
        //init from lifecycle class
        //printingg from BeanLifeCycle6
        //destroy from lifecycle class
        //use this from the Circle class and call drawing methods
        //<bean class="com.iss.spring1.Models.Circle" name="circle" destroy-method="destroy" init-method="init">
        Drawing drawing=applicationContext.getBean("drawing2",Drawing.class);
        drawing.draw();
        // that is for a single bean
        // the other way to add the init and destory method for all the beans we do add default-init-method and default-destroy-method
        // in the beans tag
        // assuming we have init and destroy methods(with names "init and destroy" in both of classes
        // after checking and running we get
        //init is called for Rectangle
        //init is called for Circle
        //Drawing Rectangle 100 50 hashcode989447607
        //Drawing Circle 25 hashcode1312381159
        //destroy is called for Circle
        //destroy is called for Rectangle
    }
}
