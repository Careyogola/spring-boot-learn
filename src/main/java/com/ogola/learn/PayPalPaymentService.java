package com.ogola.learn;

public class PayPalPaymentService implements PaymentService{

    @Override
    public void processPayment(double amount) {

        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount);
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'processPayment'");
    }
    
}
