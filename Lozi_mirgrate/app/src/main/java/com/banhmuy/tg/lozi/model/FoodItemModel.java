package com.example.tg.lozi.model;

/**
 * Created by TG on 11-11-17.
 */

public class FoodItemModel {
	private String nameFood;
	private String imageFood;
	private String address;
	private int priceFood;
	private String decribeFood;
	private int idType;
	private int id;

	public FoodItemModel(String nameFood, String imageFood, String address, int priceFood, String decribeFood, int idType, int id) {
		this.nameFood = nameFood;
		this.imageFood = imageFood;
		this.address = address;
		this.priceFood = priceFood;
		this.decribeFood = decribeFood;
		this.idType = idType;
		this.id = id;
	}

	public String getNameFood() {
		return nameFood;
	}

	public void setNameFood(String nameFood) {
		this.nameFood = nameFood;
	}

	public String getImageFood() {
		return imageFood;
	}

	public void setImageFood(String imageFood) {
		this.imageFood = imageFood;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPriceFood() {
		return priceFood;
	}

	public void setPriceFood(int priceFood) {
		this.priceFood = priceFood;
	}

	public String getDecribeFood() {
		return decribeFood;
	}

	public void setDecribeFood(String decribeFood) {
		this.decribeFood = decribeFood;
	}

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
