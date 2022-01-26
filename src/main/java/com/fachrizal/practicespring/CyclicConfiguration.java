package com.fachrizal.practicespring;


import com.fachrizal.practicespring.data.cyclic.CyclicA;
import com.fachrizal.practicespring.data.cyclic.CyclicB;
import com.fachrizal.practicespring.data.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CyclicConfiguration {
    //try to create Circular Dependency

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB){
        return  new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC){
        return  new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA){
        return  new CyclicC(cyclicA);
    }
}

