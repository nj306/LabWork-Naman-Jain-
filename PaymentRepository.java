package com.cg.es.repository;

import com.cg.es.entities.Payment;

public interface PaymentRepository {
	public Payment addPayment(Payment payment);
	public Payment updatePaymentStatus(Payment payment);
	public Payment viewPaymentDetails(int orderId);
	public double calculateTotalAmount(String month);
	public double calculateTotalAmountByProduct(String productName);
	
}
