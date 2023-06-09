package com.kafka.anish.springbootkafka.controller;

import com.kafka.anish.springbootkafka.kafka.JsonKafkaProducer;
import com.kafka.anish.springbootkafka.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private JsonKafkaProducer kafkaProducer;

    @Autowired
    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
        this.kafkaProducer = jsonKafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json Message sent successfully to kafka topic");
    }
}
