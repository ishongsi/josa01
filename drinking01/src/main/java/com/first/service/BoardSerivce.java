package com.first.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.first.domain.BoardVO;


public interface BoardSerivce {
	public List<BoardVO> getList();
	
	public void register(BoardVO boardVO);
	
	public BoardVO getBoard(Long bno);
	
	
	

}
