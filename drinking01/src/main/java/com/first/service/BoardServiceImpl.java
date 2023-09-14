package com.first.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.domain.BoardVO;
import com.first.mapper.BoardMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class BoardServiceImpl implements BoardSerivce{
	
	@Setter(onMethod_=@Autowired)
	BoardMapper mapper;
	
	@Override
	public List<BoardVO> getList()
	{
		log.info("service->getList()");
		return mapper.getList();
	}
	
	@Override
	public void register(BoardVO boardVO)
	{
		log.info("service->insert()");
		mapper.insert(boardVO);
		
	}
	
	@Override
	public BoardVO getBoard(Long bno)
	{
		return mapper.getBoard(bno);
	}
	

}
