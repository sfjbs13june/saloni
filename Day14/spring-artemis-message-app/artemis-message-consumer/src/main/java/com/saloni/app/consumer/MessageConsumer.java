package com.saloni.app.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @JmsListener(destination = "${jms.out.queue.destination}")
    public void receive(String msg){
        System.out.println("Consumer Got Message: " + msg);
    }

}

