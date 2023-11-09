package com.paymentservice.api.Controller;

import com.paymentservice.api.enitity.Payment;
import com.paymentservice.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

        @PostMapping("/payment")
    public Payment savePayment(@RequestBody Payment payment){
    return  paymentService.savePayment(payment);
    }
}
