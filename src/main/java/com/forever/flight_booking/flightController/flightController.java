package com.forever.flight_booking.flightController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.forever.flight_booking.service.KafkaProducer;

@RestController
public class flightController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping(value = "/publish")
    public ResponseEntity<String> publish(@RequestParam String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to Kafka topic");
    }

    @GetMapping(value = "/hello")
    public String greet(){
        return "Hello World!";
    }
}
