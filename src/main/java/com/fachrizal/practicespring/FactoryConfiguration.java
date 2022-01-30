package com.fachrizal.practicespring;

import com.fachrizal.practicespring.factory.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PaymentGatewayClientFactoryBean.class)
public class FactoryConfiguration {

}
