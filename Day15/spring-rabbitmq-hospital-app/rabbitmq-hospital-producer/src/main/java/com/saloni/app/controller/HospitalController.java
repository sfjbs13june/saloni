package com.saloni.app.controller;



import com.saloni.app.model.Hospital;
import com.saloni.app.model.Patient;
import com.saloni.app.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rabbitmq/")
public class HospitalController {
  @Autowired
  RabbitMQSender rabbitMQSender;


  @PostMapping(value = "/hospital")
  public Hospital postHospital(@RequestBody Hospital hospital) {
    rabbitMQSender.sendHospital(hospital);
    System.out.println("Message sent to the RabbitMQ Successfully");
    return hospital;
  }

  @PostMapping(value = "/patient")
  public Patient postPatient(@RequestBody Patient patient) {

    rabbitMQSender.sendPatient(patient);
    System.out.println("Message sent to the RabbitMQ Successfully");
    return patient;
  }
}
