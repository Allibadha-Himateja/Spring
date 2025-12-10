package com.iss.spring1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessor7 implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization for bean: "+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException
    {
        System.out.println("postProcessAfterInitialization for bean: "+beanName);
        return bean;
    }
}
