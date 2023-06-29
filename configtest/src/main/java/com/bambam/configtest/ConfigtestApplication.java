package com.bambam.configtest;

import javax.print.Doc;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ConfigtestApplication {

	public static void main(String[] args) {
		// SpringApplication.run(ConfigtestApplication.class, args);

		 ApplicationContext context = 
			new AnnotationConfigApplicationContext(BeanConfig.class);

		Doctor doctor = context.getBean(Doctor.class);
		doctor.setQualification("MBBS");
		doctor.assist();
		System.out.println(doctor);


		Doctor doctor1 = context.getBean(Doctor.class);
		System.out.println(doctor1);
		

		
	}

}
