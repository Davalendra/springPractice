package com;

public class Employees {
 int id;
 String name;
 int salary;
 	 public Employees()
 	 {
 		 
 	 }
	 public Employees(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	 }
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
	 public int getSalary() {
		 return salary;
	 }
	 public void setSalary(int salary) {
		 this.salary = salary;
	 }
	 @Override
	 public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	 }
 	 
 }
