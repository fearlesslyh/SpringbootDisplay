package com.fear.springbootdisplay.Controller;

import com.fear.springbootdisplay.Service.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 梁懿豪
 * @version 1.0
 * @Github https://github.com/fearlesslyh
 */
@RestController
public class Payment {
    @Autowired
    private PaymentProcessor paymentProcessor;
    @GetMapping("/pay")
    public String pay(@RequestParam("amount") double amount){
        paymentProcessor.process(amount);
        return "已支付";
    }
    @GetMapping("/search")
    public String search(@RequestParam(name="word",required = true,defaultValue = "cnm") String keyword){
        return "搜索结果"+ keyword;
    }

    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable("id") String id){
     return "用户id为"+id;
    }
}
