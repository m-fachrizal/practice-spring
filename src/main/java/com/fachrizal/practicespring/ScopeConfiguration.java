package com.fachrizal.practicespring;

import com.fachrizal.practicespring.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfiguration {

    @Bean
    @Scope("prototype")
    public Foo foo() {
        log.info("create new Foo");
        return new Foo();
    }
}
