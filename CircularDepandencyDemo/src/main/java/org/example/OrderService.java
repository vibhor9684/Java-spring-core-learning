package org.example;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService paymentService;

    public OrderService(){
        this.paymentService = new PaymentService();
    }

    public void placeOrder(){
        paymentService.pay();

        System.out.println("Order placed!!");
    }
}
