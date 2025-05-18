package com.hyoungjun.Course_Registration_Process;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseRegistrationProcessApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseRegistrationProcessApplication.class, args);
		/**
		 * 최소 5개의 강의가 존재해야 하며 관리자가 강의 추가할 수 있다
		 */
	}
}
