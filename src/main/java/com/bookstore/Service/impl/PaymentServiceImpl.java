package com.bookstore.Service.impl;

import org.springframework.stereotype.Service;

import com.bookstore.Service.PaymentService;
import com.bookstore.domain.Payment;
import com.bookstore.domain.UserPayment;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Override
	public Payment setByUserPayment(UserPayment userPayment, Payment payment) {
		payment.setType(userPayment.getType());
		payment.setHolderName(userPayment.getHolderName());
		payment.setCardNumber(userPayment.getCardNumber());
		payment.setExpiryMonth(userPayment.getExpiryMonth());
		payment.setExpiryYear(userPayment.getExpiryYear());
		payment.setCvc(userPayment.getCvc());
		
		return payment;
	}
	
	 	

}
