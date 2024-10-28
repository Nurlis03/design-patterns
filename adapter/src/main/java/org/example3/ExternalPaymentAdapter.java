package org.example3;

/**
 * Adapter that wrap external service to interface of oup application
 * */
public class ExternalPaymentAdapter implements PaymentProcessor {

    private final ExternalPaymentService externalPaymentService;

    public ExternalPaymentAdapter(ExternalPaymentService externalPaymentService) {
        this.externalPaymentService = externalPaymentService;
    }

    @Override
    public void processPayment(double amount) {
        externalPaymentService.makePayment(amount);
    }
}
