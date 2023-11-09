package com.paymentservice.api.Repository;

import com.paymentservice.api.enitity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
