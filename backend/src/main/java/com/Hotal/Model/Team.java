package com.Hotal.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Team {
	
	@Id
	private int id;
	private String name;
	private int age;
	private String department;
	private String image;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + ", image=" + image
				+ "]";
	}
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
