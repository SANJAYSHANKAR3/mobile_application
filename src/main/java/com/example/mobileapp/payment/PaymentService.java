package com.example.mobileapp.payment;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface PaymentService {
    Payment processpayment(Payment newPayment);
    Optional<Payment> cancelpayment(Integer id);
    Optional<Payment> getPaymentdetails(Integer id);

}
