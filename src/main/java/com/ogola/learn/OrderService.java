package com.ogola.learn;

import org.springframework.boot.web.server.servlet.context.ServletComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class OrderService {

    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {

        this.paymentService =paymentService;

    }
    public void placeOrder() {
        //var paymentService = new StripePaymentService();
        paymentService.processPayment(100);
    }
}
