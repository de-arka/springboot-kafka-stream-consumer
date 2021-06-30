package com.kafka.stream.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Event Consumer Application leveraging both Kafka Stream and Cloud Stream
 */
@SpringBootApplication
public class SpringbootKafkaStreamConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootKafkaStreamConsumerApplication.class, args);
    }

}
