package com.orange.maykantoch.model;

public class Location {

	private String id;
	private String username;
	private int coordX;
	private int coordY;

	public Location() {}
	
	public Location(String id, String username, int coordX, int coordY) {
		super();
		this.id = id;
		this.username = username;
		this.coordX = coordX;
		this.coordY = coordY;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getCoordX() {
		return coordX;
	}

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}

}
