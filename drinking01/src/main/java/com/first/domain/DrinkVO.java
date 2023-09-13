package com.first.domain;

import java.util.Date;

import lombok.Data;

@Data
public class DrinkVO {



	private int drinkId;
	private String drinkName;
	private String cateCode;
	/* 카테고리 이름 */
	private String cateName;
	/* 주류 가격 */
	private int drinkPrice;	
	/* 주류 소개 */
	private String drinkIntro;
	
	
	 
}

