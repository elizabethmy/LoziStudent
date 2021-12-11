package com.example.tg.lozi.model;

/**
 * Created by TG on 09-11-17.
 */

public class MainItemModel {
	private int id;
	private String name;
	private String photo;

	public MainItemModel(int id, String name, String photo) {
		this.id = id;
		this.name = name;
		this.photo = photo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
}
