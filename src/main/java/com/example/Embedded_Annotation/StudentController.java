package com.example.Embedded_Annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@Autowired
StudentRepository srepo;

@RequestMapping("/testing")
public String testing()
{
	return "testing database...........!";
}
@RequestMapping("/saved")
public String saved()
{
	Student s=new Student();
	StudentDetails sd=new StudentDetails();
	StudentFamily sf=new StudentFamily();
	s.setName("vipin kumar");
	s.setAge(40);
	sd.setFathers_name("anil kumar");
	sd.setAddress("dhanbad");
	sd.setPhone_no(9127363587l);
	sf.setMothers_name("heena devi");
	sf.setBothers_name("rahul kumar");
	s.setStudentdetail(sd);
	s.setStudentfamily(sf);
	srepo.save(s);
	return "data saved.............!";
}
@RequestMapping("/findall")
public List<Student> all()
{
	return srepo.findAll();
}
}
