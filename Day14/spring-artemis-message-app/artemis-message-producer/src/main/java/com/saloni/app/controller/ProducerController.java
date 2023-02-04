package com.saloni.app.controller;

import com.saloni.app.producer.MessageProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerController.class);
    private final MessageProducer producer;

    public ProducerController(MessageProducer producer) {
        this.producer = producer;
    }


    @RequestMapping(value = "/send/message", method = RequestMethod.GET)
    public ResponseEntity<String> produce(@RequestParam("name") String name, @RequestParam("age") String age) {
        try {
            String message = name+" : "+age;
            producer.send(message);
            return ResponseEntity.ok()

                                 .body("Message sent -> "+message);
        } catch (Exception e) {
            LOGGER.error("Exception while handling uplink message: ", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
