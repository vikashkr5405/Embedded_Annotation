package com.example.Embedded_Annotation;

import jakarta.persistence.Embeddable;

@Embeddable
public class StudentDetails {
String fathers_name;
String Address;
long phone_no;
public String getFathers_name() {
	return fathers_name;
}
public void setFathers_name(String fathers_name) {
	this.fathers_name = fathers_name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public long getPhone_no() {
	return phone_no;
}
public void setPhone_no(long phone_no) {
	this.phone_no = phone_no;
}

}
