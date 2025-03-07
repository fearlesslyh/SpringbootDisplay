package com.fear.springbootdisplay.Service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author 梁懿豪
 * @version 1.0
 * @Github https://github.com/fearlesslyh
 */
@Data
@Component
public class PaymentProcessor {
    private PaymentService paymentService;
    @Autowired
    public PaymentProcessor(@Qualifier("creditCard") PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @TrackTime
    public void process(double amount){
        paymentService.payment(amount);
    }
}
