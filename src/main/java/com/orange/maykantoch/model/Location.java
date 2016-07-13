package com.orange.maykantoch.model;

public class Location {

	private String id;
	private String username;
	private String coordX;
	private String coordY;

	public Location(String id, String username, String coordX, String coordY) {
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

	public String getCoordX() {
		return coordX;
	}

	public void setCoordX(String coordX) {
		this.coordX = coordX;
	}

	public String getCoordY() {
		return coordY;
	}

	public void setCoordY(String coordY) {
		this.coordY = coordY;
	}

}
