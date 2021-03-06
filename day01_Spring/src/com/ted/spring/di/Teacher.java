package com.ted.spring.di;

import java.util.List;
import java.util.Map;

public class Teacher {
	
	private Integer id;
	private String name;
	private List<String> classes;
	private List<Student> students;
	private Map<String, String> bossMap;
	
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
	
	public List<String> getClasses() {
		return classes;
	}
	public void setClasses(List<String> classes) {
		this.classes = classes;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Map<String, String> getBossMap() {
		return bossMap;
	}
	public void setBossMap(Map<String, String> bossMap) {
		this.bossMap = bossMap;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", classes=" + classes + ", students=" + students + ", bossMap="
				+ bossMap + "]";
	}
	
	
}
