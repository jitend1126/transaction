package transaction.RestApi.Service.impl;

import java.util.UUID;

import org.hibernate.id.UUIDGenerationStrategy;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import transaction.RestApi.Dto.orderRequest;
import transaction.RestApi.Dto.orderResponse;
import transaction.RestApi.Entity.orders;
import transaction.RestApi.Entity.payment;
import transaction.RestApi.Exception.paymentException;
import transaction.RestApi.Service.orderService;
import transaction.RestApi.repository.orderRepository;
import transaction.RestApi.repository.paymentRepository;

@Service
public class orderServiceImpl implements orderService {
	@Autowired
	private orderRepository orderRepository;
	private paymentRepository paymentRepository;

	public orderServiceImpl(orderRepository orderRepository,
			paymentRepository paymentRepository) {
	
		this.orderRepository = orderRepository;
		this.paymentRepository = paymentRepository;
	}

	@Override
	@Transactional
	public orderResponse placeOrder(orderRequest orderRequest) {
		orders orders=orderRequest.getOrder();
		orders.setOrderTrackingId(UUID.randomUUID().toString());
		orders.setStatus("InProgress");
		orderRepository.save(orders);
		payment payment=orderRequest.getPayment();
		if(!payment.getType().equals("DEBIT"))
		{
			throw new paymentException("t support only debit");
		}
		else {
			
		
			payment.setOrderId(orders.getId());
			paymentRepository.save(payment);
		}
		
		orderResponse orderResponse =new orderResponse();
		orderResponse.setMessage("Success");
		orderResponse.setOrderTrackingNo(orders.getOrderTrackingId());
		orderResponse.setStatus(orders.getStatus());
		return orderResponse;
		
		
		
		// TODO Auto-generated method stub
	
	}

}
