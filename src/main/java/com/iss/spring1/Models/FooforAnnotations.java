package com.iss.spring1.Models;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class FooforAnnotations {

	@Autowired
	@Qualifier("bar2")

//    @Resource(name="bar2")
    // the use of resourse annotation is similar to autowired and qualifier
    // resource annotation uses type by default
    // if we mention the name attribute then it will inject with bean name
    // if we have just @Resource then in bar bar-1
    // if @Resource(name="bar2") then in bar bar-2
    // that too no need of manually mentioning of qualifier value inside the bean
    private BarforAnnotations bar;

    @Autowired //bytype by default
    MessageSource source;

    public MessageSource getSource() {
        return source;
    }

    public void setSource(MessageSource source) {
        this.source = source;
    }

    public void setBar(BarforAnnotations bar){
        this.bar=bar;
    }

    public void print(){
        System.out.println(bar);
        this.bar.print();
    }

    // the usecase of the Two annotation which are PostConstruct and PreDestroy are similar to BeanPostProcessor
    // there we were having the two methods which are postProcessBeforeInitialization and postProcessorAfterInitialization
    // but when we only want processing for only one bean we can able to use these annotation which will map with particular
    // function example is init for PostConstruct and destroy for PreDestroy

    @PostConstruct
    public void init()
    {
        // this method is called before the bean is been initialized
//        this.bar=new BarforAnnotations();
//        this.bar.setDescription("from init");
        System.out.println("in init");
//        System.out.println(source.getMessage("message",null, null));
    }
    @PreDestroy
    public void destroy()
    {
        // this method is called after the bean is been destroyed
        // IMPORTANT POINT IS WE CANNOT SEE THE CALLING OF THIS DESTRUCTION METHOD
        // IF WE DONT MENTION THE
        // context.registerShutDownHook();
        System.out.println("in destroy");
    }

}

