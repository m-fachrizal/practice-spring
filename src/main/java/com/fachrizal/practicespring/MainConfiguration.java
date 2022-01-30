package com.fachrizal.practicespring;

import com.fachrizal.practicespring.configuration.BarConfiguration;
import com.fachrizal.practicespring.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
