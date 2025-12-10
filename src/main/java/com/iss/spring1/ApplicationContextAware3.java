package com.iss.spring1;

import com.iss.spring1.Models.Drawing;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAware3 implements ApplicationContextAware {

    // the need of the applicationContext is for calling the getBean() method
    // what if we need the applicationContext in other beans
    // we can use the ApplicationContextAware for this requirement

    // the ApplicationContextAware is an interface
    // which contains one method ->setApplicationContext
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("we got the ApplicationContext so we can use the getBean from ApplicationContextAware3");
        Drawing drawing = (Drawing) applicationContext.getBean("drawing");
        drawing.draw();
        System.out.println("we got the Drawing bean from ApplicationContextAware3");
        // for checking this we need to run the injection2.java
    }
}
