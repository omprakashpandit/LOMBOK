package com.pak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);

		Student student=new Student();
		student.setFirstname("OM");
		System.out.println(student.getFirstname());
	}




}
