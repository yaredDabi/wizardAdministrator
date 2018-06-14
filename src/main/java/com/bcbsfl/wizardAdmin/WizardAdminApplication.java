package com.bcbsfl.wizardAdmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WizardAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(WizardAdminApplication.class, args);
		System.out.println("server starts at port 8080");
	}
}
