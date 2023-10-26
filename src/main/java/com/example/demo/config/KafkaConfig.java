package com.example.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.support.converter.JsonMessageConverter;
import org.springframework.kafka.support.converter.RecordMessageConverter;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic testTopic(){
        return TopicBuilder.name("test").build();
    }

    @Bean
    public RecordMessageConverter converter() {
        return new JsonMessageConverter();
    }

    
}
