package com.first.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.first.domain.BoardVO;
import com.first.service.BoardSerivce;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@Log4j
public class BoardController {
	
	@Autowired
	private BoardSerivce service;
	
	@GetMapping("/list")
	public void list(Model model)
	{
		log.info("controller list()");
		List<BoardVO> BoardList = service.getList();
		model.addAttribute("boardList" , BoardList);
		
	}
	
	
	
	
	
	

}
