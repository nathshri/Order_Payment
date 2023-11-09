package com.paymentservice.api.service;

import com.paymentservice.api.Repository.PaymentRepository;
import com.paymentservice.api.enitity.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository){
        this.paymentRepository=paymentRepository;

    }
    public Payment savePayment(Payment payment){
       return paymentRepository.save(payment);
    }
}
