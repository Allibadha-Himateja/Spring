package com.iss.spring1;

import com.iss.spring1.Models.FooforAnnotations;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotations8
{
    public static void main(String[] args)
    {
        ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("Annotations8.xml");
        applicationContext.registerShutdownHook();

        FooforAnnotations foo=applicationContext.getBean(FooforAnnotations.class);
        foo.print();
        // the annotations are the tools provided by the Spring
        // the most cases of using the annotations we are using the
        // @Autowired,@Qualifier,@Resource,@PostConstruct,@PreDestroy

        // @Autowired is for dependency injection we are going to use this annotations
        // Used to automatically inject dependencies (collaborating objects) into a Spring bean.
        // Spring's core mechanism for Dependency Injection (DI).(THIS MAINLY USED FOR THESE TYPE BASED DEPENDENCY INJECTION)

        // @Resource A Java standard annotation that can also be used for dependency injection.
        // By default, it injects by name first, and if a match is not found, it attempts to inject by type.
        // (DEPENDENCY INJECTION BY NAME)

        //@Qualifier which is used for signifying the name for the autowired injection
        // used along with @Autowired annotations.
        // there is a specific way using the @Qualifier
        // @Autowired
        // @Qualifier("emailNotificationService")

        // The preferred way: Annotation placed on the constructor parameter
        //    public OrderService(@Qualifier("emailNotificationService") NotificationService notificationService) {
        //        this.notificationService = notificationService;
        //    }

        // CREATING YOUR OWN ANNOTATIONS IN SPRING
        // which is  by creating user own annotation using the @Qualifier
        // we have use another annotations for creating a custom annotation
        // You define an annotation just like an interface, but prefix it with @.
        // You must also apply several meta-annotations to define how it will be processed by the Java compiler and Spring Framework.

        // @Retention(RetentionPolicy.RUNTIME): Crucial for Spring.
        // Ensures the annotation is available to the Java Virtual Machine (JVM) at runtime so Spring can read it.
        // @Target: Defines where the annotation can be applied (e.g., classes, methods, fields).
        // example:


        // 1. Retention: Must be available at runtime
        // @Retention(RetentionPolicy.RUNTIME)
        // 2. Target: Only methods can be tracked
        // @Target(ElementType.METHOD)
        // public @interface TrackExecutionTime {
        //    // Optional element: Allows a custom description in the log message
        //    String description() default "Execution Time";
        //  }

        // usage for this custom annotation
        // pause this for a bit please we have to make sure we learn the aspects and AOP first

    }

}
