package com.kafka.anish.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

//    for string
    @Bean
    public NewTopic javaguidesTopic(){
        return TopicBuilder.name("javaguides")
                .build();
    }

//    for json
    @Bean
    public NewTopic javaguidesJsonTopic(){
        return TopicBuilder.name("javaguides_json")
                .build();
    }
}
