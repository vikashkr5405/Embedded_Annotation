package com.example.Embedded_Annotation;


import java.util.Date;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@EnableJSONDoc
@SpringBootApplication
public class Embedded_AnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(Embedded_AnnotationApplication.class, args);
	}
   @Scheduled(fixedDelay=5000)
   public void Schedule()
   {
	   System.out.println("current time"+new Date());
   }
}
