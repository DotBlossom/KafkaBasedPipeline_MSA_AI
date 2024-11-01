package com.example.kafkaAsyncTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class KafkaAsyncTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaAsyncTestApplication.class, args);
	}

}
