package com.fachrizal.practicespring;

import com.fachrizal.practicespring.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "com.fachrizal.practicespring.service",
        "com.fachrizal.practicespring.repository",
        "com.fachrizal.practicespring.configuration"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
