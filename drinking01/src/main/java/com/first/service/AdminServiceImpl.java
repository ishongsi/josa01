package com.first.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.domain.CateVO;
import com.first.domain.DrinkVO;
import com.first.mapper.AdminMapper;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class AdminServiceImpl implements AdminService{
	
@Autowired
private AdminMapper adminMapper;

 //주류 등록
@Override
public void drinkEnroll(DrinkVO drink) {
	log.info("(service)drinkEnroll......");
	
	adminMapper.drinkEnroll(drink);
}
 //카테고리 리스트
@Override
public List<CateVO> cateList() {
	
	log.info("(service)cateList........");
	
	return adminMapper.cateList();
}
}
