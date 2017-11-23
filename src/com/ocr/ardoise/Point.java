package com.ocr.ardoise;

import java.awt.Color;

//CTRL + SHIFT + O pour g�n�rer les imports 
public class Point {

	//Couleur du point
	private Color color = Color.red;
	//Taille
	private int size = 10;
	//Position sur l'axe X : initialis� au dehors du conteneur
	private int x = -10;
	//Position sur l'axe Y : initialis� au dehors du conteneur
	private int y = -10;
	//Type de point
	private String type = "ROND";

	// Constructeur par d�faut
	public Point(){}

	public Point(int x, int y, int size, Color color, String type){
		this.size = size;
		this.x = x;
		this.y = y;
		this.color = color;
		this.type = type;
	}

	//ACCESSEURS
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}