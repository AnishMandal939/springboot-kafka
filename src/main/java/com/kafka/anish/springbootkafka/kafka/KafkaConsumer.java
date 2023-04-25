package com.kafka.anish.springbootkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

//    logger to log message

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

//    kakfa listener to listener and subscribe to topic

    @KafkaListener(topics = "javaguides", groupId = "myGroup")
    public void consume(String message){
        LOGGER.info(String.format("Message received -> %s", message));
    }
}
