package com.first.service;

import java.util.List;

import com.first.domain.CateVO;
import com.first.domain.DrinkVO;

public interface AdminService {

	/* 주류 등록 */
	public void drinkEnroll(DrinkVO drink);
	/* 카테고리 리스트 */
	public List<CateVO> cateList();
}
