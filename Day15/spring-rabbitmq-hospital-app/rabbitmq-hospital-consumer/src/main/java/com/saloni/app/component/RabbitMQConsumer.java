package com.saloni.app.component;


import com.saloni.app.model.HospitalNew;
import com.saloni.app.model.PatientNew;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {
  @Value("${rabbitmq.queue.name}")
  String queueName;

  @Value("${rabbitmq.exchange.name}")
  String exchange;

  @Value("${rabbitmq.routingkey.name}")
  private String routingkey;
  @Bean
  public Jackson2JsonMessageConverter converter() {
    return new Jackson2JsonMessageConverter();
  }

  @RabbitListener(queues = "${rabbitmq.queue.name}")
  public void receivedMessage(HospitalNew hospitalNew) {
    System.out.println("Received Message From RabbitMQ: " + hospitalNew);
  }

  @RabbitListener(queues = "${rabbitmq.queue.name}")
  public void receivedMessage1(PatientNew patientNew) {
    System.out.println("Received Message From RabbitMQ: " + patientNew);
  }
}
