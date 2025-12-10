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

    // this is the BeanPostProcessor which will handle these two methods which are called accordingly as the name holds
    // which means we can able to orgainse the bean creation from this BeanPostProcessor
    // all we have to do is that we have to create a bean from this above class

    // <bean class="com.iss.Spring1.BeanPostProcessor7" name="postprocessor"></bean>

    // WHAT IT WILL DO IS THAT IT WILL APPLY THESE METHODS FOR EVERYBEAN INSIDE THE CONTAINER, WHICH ARE INIT AND DESTROY
    // check the BeanLifeCycle6,7 for the xml configuration
    // THE OUTCOME FOR THIS IS
    //  postProcessBeforeInitialization for bean: rectangle2
    //postProcessAfterInitialization for bean: rectangle2
    //postProcessBeforeInitialization for bean: drawing
    //postProcessAfterInitialization for bean: drawing
    //postProcessBeforeInitialization for bean: circle
    //postProcessAfterInitialization for bean: circle
    //postProcessBeforeInitialization for bean: drawing2
    //postProcessAfterInitialization for bean: drawing2
    //Drawing Rectangle 100 50 hashcode279593458
    //Drawing Circle 25 hashcode111900554
}
