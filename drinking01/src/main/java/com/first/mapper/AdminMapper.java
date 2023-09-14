package com.first.mapper;

import java.util.List;

import com.first.domain.CateVO;
import com.first.domain.DrinkVO;

public interface AdminMapper {

	public void drinkEnroll(DrinkVO drink); //상품 등록
	public List<CateVO> cateList(); //카테고리 리스트
}
