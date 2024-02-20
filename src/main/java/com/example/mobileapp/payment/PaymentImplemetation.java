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

//    @Override
//    public Optional<Payment> cancelpayment(Integer id){
//        return this.paymentRepository.deleteById(id);
//    }
    @Override
    public Payment cancelpaymentById(Integer id) {
        Optional<Payment> paymentopt = this.paymentRepository.findById(id);
        // exception handling
        this.paymentRepository.deleteById(id);
        return paymentopt.get();
    }


    @Override
    public Optional<Payment> getPaymentdetails(Integer id){
        return this.paymentRepository.findById(id);
    }
}
