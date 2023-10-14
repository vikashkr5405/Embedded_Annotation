package com.example.Embedded_Annotation;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="Student")
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String name;
int age;

@Embedded
StudentDetails studentdetails;

@Embedded
StudentFamily studentfamily;

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
public StudentDetails getStudentdetail() {
	return studentdetails;
}
public void setStudentdetail(StudentDetails studentdetail) {
	this.studentdetails = studentdetail;
}
public StudentFamily getStudentfamily() {
	return studentfamily;
}
public void setStudentfamily(StudentFamily studentfamily) {
	this.studentfamily = studentfamily;
}

}
