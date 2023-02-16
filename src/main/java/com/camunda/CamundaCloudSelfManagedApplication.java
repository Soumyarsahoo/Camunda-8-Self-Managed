package com.camunda;

import io.camunda.zeebe.spring.client.EnableZeebeClient;
import io.camunda.zeebe.spring.client.annotation.ZeebeDeployment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableZeebeClient
@ZeebeDeployment(resources = "classpath:leave-request.bpmn")
public class CamundaCloudSelfManagedApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamundaCloudSelfManagedApplication.class, args);
	}

}
