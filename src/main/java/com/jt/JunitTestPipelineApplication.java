package com.jt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JunitTestPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunitTestPipelineApplication.class, args);
	}

}
