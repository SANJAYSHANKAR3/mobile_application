package com.example.mobileapp.payment;

import com.example.mobileapp.product.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("processPayment/id")
    public Payment createAccount(@RequestBody product products) {
        return this.paymentService.createPayment(products);
    }
    @PutMapping("cancelpayment/id")
    public product updateAccount(@RequestBody product products) {
        return this.paymentService.updateProduct(products);
    }
    @GetMapping("getpayment/id")
    public product getAccountById(@PathVariable("id") Integer accountId) {
        return this.paymentService.getAccountById(accountId);
    }
}
