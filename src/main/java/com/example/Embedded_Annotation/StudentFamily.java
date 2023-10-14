package com.example.Embedded_Annotation;

import jakarta.persistence.Embeddable;

@Embeddable
public class StudentFamily 
{
String mothers_name;
String bothers_name;
public String getMothers_name() {
	return mothers_name;
}
public void setMothers_name(String mothers_name) {
	this.mothers_name = mothers_name;
}
public String getBothers_name() {
	return bothers_name;
}
public void setBothers_name(String bothers_name) {
	this.bothers_name = bothers_name;
}
}
