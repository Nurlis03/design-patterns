package org.example3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ExternalPaymentService externalPaymentService() {
        return new ExternalPaymentService();
    }

    @Bean
    public PaymentProcessor paymentProcessor(ExternalPaymentService externalPaymentService) {
        return new ExternalPaymentAdapter(externalPaymentService);
    }
}
