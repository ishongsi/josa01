package com.first.mapper;

import java.util.List;

import com.first.domain.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> getList();
	
	public void insert(BoardVO boardVO);
	
	public BoardVO getBoard(Long bno);

}
