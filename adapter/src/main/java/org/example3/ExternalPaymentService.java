package org.example3;


/**
 * External service(for example, external api) with incompatible interface
 * */
public class ExternalPaymentService {
    public void makePayment(double money) {
        System.out.println("Processing payment of  " + money + " via Externel Payment Service");
    }
}
