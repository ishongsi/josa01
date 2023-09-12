package com.first.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.first.domain.BoardVO;

@Service
public interface BoardSerivce {
	public List<BoardVO> getList();
	
	
	

}
