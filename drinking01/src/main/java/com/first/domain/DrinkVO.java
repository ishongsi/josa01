package com.first.domain;

import java.util.Date;

public class DrinkVO {

	/* 주류 id */
	private int drinkId;
	
	/* 주류 이름 */
	private String drinkName;
	
	
	/* 카테고리 코드 */
	private String cateCode;
	
	/* 카테고리 이름 */
	private String cateName;
	
	/* 주류 가격 */
	private int drinkPrice;
	
	
	/* 주류 소개 */
	private String drinkIntro;
	
	
	
	 //getter,setter,toString 메서드 생성
	
	public int getDrinkId() {
		return drinkId;
	}


	public void setDrinkId(int drinkId) {
		this.drinkId = drinkId;
	}


	public String getDrinkName() {
		return drinkName;
	}


	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}


	public String getCateCode() {
		return cateCode;
	}


	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}


	public String getCateName() {
		return cateName;
	}


	public void setCateName(String cateName) {
		this.cateName = cateName;
	}


	public int getDrinkPrice() {
		return drinkPrice;
	}


	public void setDrinkPrice(int drinkPrice) {
		this.drinkPrice = drinkPrice;
	}


	public String getDrinkIntro() {
		return drinkIntro;
	}


	public void setDrinkIntro(String drinkIntro) {
		this.drinkIntro = drinkIntro;
	}


	@Override
	public String toString() {
		return "DrinkVO [drinkId=" + drinkId + ", drinkName=" + drinkName + ", cateCode=" + cateCode + ", cateName="
				+ cateName + ", drinkPrice=" + drinkPrice + ", drinkIntro=" + drinkIntro + "]";
	}
}

