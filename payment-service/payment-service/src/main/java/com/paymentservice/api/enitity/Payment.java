package com.paymentservice.api.enitity;
import lombok.*;

import javax.persistence.*;

@Entity(name= "PAYMENT_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String paymentStatus;
    private String transactionId;

}
