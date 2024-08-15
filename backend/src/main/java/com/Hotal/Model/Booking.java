package com.Hotal.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Booking {

	@Id
	private int id;
	private String email;
	private String password;
	private String name;
	private int payment;
	private String city;
	private String image;
	private int people;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", payment="
				+ payment + ", city=" + city + ", image=" + image + ", people=" + people + "]";
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
