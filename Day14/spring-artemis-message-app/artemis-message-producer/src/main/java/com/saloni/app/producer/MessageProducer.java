package com.saloni.app.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.UncategorizedJmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageProducer.class);
    private final JmsTemplate jmsTemplate;

    @Value("${jms.out.queue.destination}")
    String destinationQueue;

    public MessageProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }
    public void send(String message) {
        LOGGER.info("Sending Data:");
        jmsTemplate.convertAndSend(destinationQueue, message);
        LOGGER.info("Data Sent:");
    }
}

