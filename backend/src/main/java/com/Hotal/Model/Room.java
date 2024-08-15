package com.Hotal.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Room {

	@Id
	private int id;
	private String name;
	private int payment;
	private String city;
	private String image;
	private int people;
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	private String decrip;
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
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDecrip() {
		return decrip;
	}
	public void setDecrip(String decrip) {
		this.decrip = decrip;
	}
	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", payment=" + payment + ", city=" + city + ", image=" + image
				+ ", people=" + people + ", decrip=" + decrip + "]";
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
