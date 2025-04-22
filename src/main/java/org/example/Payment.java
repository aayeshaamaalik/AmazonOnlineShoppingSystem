package org.example;

public class Payment {
    private PaymentStatus status;
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
        this.status = PaymentStatus.Pending;
    }

    public PaymentStatus processPayment() {
        // For simulation purposes we mark all as successful
        this.status = PaymentStatus.Completed;
        return status;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public double getAmount() {
        return amount;
    }
}

