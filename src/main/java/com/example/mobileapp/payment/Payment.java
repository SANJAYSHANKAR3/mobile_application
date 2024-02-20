package com.example.mobileapp.payment;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
    @Table(name="PAYMENT")
    public class Payment {

        @Id
        @GeneratedValue
        @Column(name="ID")
        private Integer id;
        @Column(name="TYPE")
        private String type;
        @Column(name="PAYMENTDATE")
        private LocalDate paymentDate;
        public Payment() {
            super();
        }
        public Payment(Integer id, String type, LocalDate payementDate) {
            super();
            this.id = id;
            this.type = type;
            this.paymentDate = payementDate;
        }
        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }
        public LocalDate getPayementDate() {
            return paymentDate;
        }
        public void setPayementDate(LocalDate payementDate) {
            this.paymentDate = payementDate;
        }
    }

