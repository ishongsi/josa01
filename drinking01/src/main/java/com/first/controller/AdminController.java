package com.first.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.first.domain.DrinkVO;
import com.first.service.AdminService;

@Controller
@RequestMapping("/admin")
	public class AdminController {
	
	 private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	 
	 @Autowired
	 private AdminService adminService;
	  

	    @RequestMapping(value="main", method = RequestMethod.GET)
	    public void adminMainGET() throws Exception{	        
	        logger.info("관리자 페이지로 이동");
	        
	        /*@RequestMapping(value = "goodsManage", method = RequestMethod.GET)
	        public void goodsManageGET() throws Exception{
	            logger.info("상품 등록 페이지 접속");
	        }
	        
	        @RequestMapping(value = "goodsEnroll", method = RequestMethod.GET)
	        public void goodsEnrollGET() throws Exception{
	            logger.info("상품 등록 페이지 접속");
	        }*/
	    }
}