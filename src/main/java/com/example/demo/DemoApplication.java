package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@KafkaListener(id = "quickEvent1", topics = "quickstart-events")
	public void dltListen(Foo foo) {
		log.info("Received Event: " + foo.toString());
	}
	

}
