package com.example.mobileapp.payment;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentImplemetation implements PaymentService{
    private PaymentRepository paymentRepository;

    @Override
    public Payment processpayment(Payment newPayment){
        return this.paymentRepository.save(newPayment);
    }

    @Override
    public Optional<Payment> cancelpayment(Integer id){
        return this.paymentRepository.deleteById(id);
    }

    @Override
    public Optional<Payment> getPaymentdetails(Integer id){
        return this.paymentRepository.findById(id);
    }
}
