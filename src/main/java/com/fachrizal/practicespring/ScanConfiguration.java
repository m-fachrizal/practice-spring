package com.fachrizal.practicespring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.fachrizal.practicespring.configuration"
})
public class ScanConfiguration {

}
