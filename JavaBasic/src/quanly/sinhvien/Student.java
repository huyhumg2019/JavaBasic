package quanly.sinhvien;

import java.io.Serializable;

public class Student implements Serializable{
	private int id,age;
	private String name,address;
	private float gpa;
	
	public Student(int id, int age, String name, String address, float gpa) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
		this.gpa = gpa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
