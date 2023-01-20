package com.excavator.boot.springboot3graalvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot3GraalvmApplication {

	public static void main(String[] args) {
		Companion.main(args);
	}
	static class Companion{
		static void main(String[] args){
			SpringApplication.run(Springboot3GraalvmApplication.class, args);
		}
	}
}
