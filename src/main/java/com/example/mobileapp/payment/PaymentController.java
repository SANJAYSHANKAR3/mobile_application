package com.example.mobileapp.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("processPayment/id")
    public Payment processpayment(@RequestBody Payment newPayment) {
        return this.paymentService.processpayment(newPayment);
    }
//    @PutMapping("cancelpayment/id")
//    public Optional<Payment> cancelpayment(@RequestBody Integer id) {
//        return this.paymentService.cancelpayment(id);
//    }
    @DeleteMapping("payment/{id}")
    public Payment cancelpaymentById(@PathVariable Integer id) {
        return this.paymentService.cancelpaymentById(id);
    }
    @GetMapping("getpayment/id")
    public Optional<Payment> getPaymentdetails(@PathVariable("id") Integer id) {
        return this.paymentService.getPaymentdetails(id);
    }
}
