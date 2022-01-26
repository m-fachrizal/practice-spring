package com.fachrizal.practicespring;

import com.fachrizal.practicespring.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }

    @Test
    void testDependsOn() {
        //Bar will be created.
    }

    @Test
    void testLazyBean() {
        //Foo will not be created at start up until Foo is called or needed.
        Foo foo = applicationContext.getBean(Foo.class);
    }
}
