package com.kafka.stream.consumer.config;

import com.kafka.stream.model.CustomMessage;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

/**
 * Kafka Message Consumer Class
 */
@Slf4j
@Configuration
public class KafkaMessageConsumer {

    /**
     * Kafka Stream Consumer Bean
     * @return
     */
    @Bean
    public Consumer<KStream<String, CustomMessage>> messagesConsumer() {
        return kstream -> kstream.foreach((key, customMessage) -> log.info(String.format("Received Message %s", customMessage.toString())));
    }

}
