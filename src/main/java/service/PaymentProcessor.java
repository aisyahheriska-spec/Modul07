package service;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aisya
 */
import model.Payment;
import model.Transaction;

public class PaymentProcessor {

    private TransactionHistory transactionHistory;

    public PaymentProcessor(TransactionHistory transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public void processTransaction(String id, double amount, Payment paymentMethod) {
        Transaction transaction = new Transaction(id, amount, paymentMethod);
        transaction.processPayment();
        transactionHistory.addTransaction(transaction);
    }
}
