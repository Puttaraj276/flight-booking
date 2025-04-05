package com.forever.flight_booking.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    private static final Logger logger = Logger.getLogger(KafkaProducer.class.getName());

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(String message) {
        logger.info(null != message ? "Sending message: " + message : "Message is null");
        kafkaTemplate.send("flight-booking-topic", message);
    }
}
