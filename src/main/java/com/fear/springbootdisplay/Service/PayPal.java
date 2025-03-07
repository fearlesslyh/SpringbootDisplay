package com.fear.springbootdisplay.Service;

import org.springframework.stereotype.Service;

/**
 * @author 梁懿豪
 * @version 1.0
 * @Github https://github.com/fearlesslyh
 */
@Service("payPal")
public class PayPal implements PaymentService {
    @Override
    public String payment(double amount) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "PayPal支付 ￥ "+amount+" 成功！";
    }
}
