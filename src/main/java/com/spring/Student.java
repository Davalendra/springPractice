package com.spring;

import java.util.List;

public class Student {
	int stuId;
	String name;
	int marks;
	List<String> skills;
	
	public Student()
	{
		
	}
	
	public Student(int stuId, String name, int marks, List<String> skills) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.marks = marks;
		this.skills = skills;
	}

	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + ", marks=" + marks + ", skills=" + skills + "]";
	}
	
}
