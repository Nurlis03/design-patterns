package org.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final PaymentProcessor paymentProcessor;

    @Autowired
    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void makePayment(double amount) {
        paymentProcessor.processPayment(amount);
    }
}
