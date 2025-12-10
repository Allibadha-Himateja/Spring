package com.iss.spring1;

import com.iss.spring1.Models.FooforAnnotations;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotations8
{
    public static void main(String[] args)
    {
        ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("Annotations.xml");
        applicationContext.registerShutdownHook();

        FooforAnnotations foo=applicationContext.getBean(FooforAnnotations.class);
        foo.print();
    }

}
