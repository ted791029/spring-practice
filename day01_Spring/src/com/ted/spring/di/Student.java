package com.ted.spring.di;

public class Student {
	private Integer id;
	private String name;
	private Integer age;
	private Double score;
	private Teacher teacher;
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", score=" + score + ", teacher=" + teacher
				+ "]";
	}
	public Student(Integer id, String name, Integer age, Double score) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
