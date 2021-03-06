package com.bookstore.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.Service.UserShippingService;
import com.bookstore.domain.UserShipping;
import com.bookstore.repository.UserShippingRepository;

@Service
public class UserShippingServiceImpl implements UserShippingService {
	@Autowired
	private UserShippingRepository userShippingRepository;
	
	public UserShipping findById(Long id){
		return userShippingRepository.findOne(id);
	}
	
	public void removeById(Long id){
		 userShippingRepository.delete(id);
	}

}
