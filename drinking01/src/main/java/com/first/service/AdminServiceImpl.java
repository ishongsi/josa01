package com.first.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.domain.DrinkVO;
import com.first.mapper.AdminMapper;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class AdminServiceImpl implements AdminService{
	
@Autowired
private AdminMapper adminMapper;

 
@Override
public void drinkEnroll(DrinkVO drink) {
	log.info("(service)drinkEnroll......");
	
	adminMapper.drinkEnroll(drink);
}
	
}
