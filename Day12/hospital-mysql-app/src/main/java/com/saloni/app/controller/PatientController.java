package com.saloni.app.controller;

import com.saloni.app.model.Appointment;
import com.saloni.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    AppointmentRepository appointmentRepository;

    @GetMapping( "/appointment")
    public @ResponseBody
    Iterable<Appointment> getAll() {
        return appointmentRepository.findAll();
    }

    @PostMapping("/save")
    public @ResponseBody
    String store(@RequestBody final Appointment appointment) {
        appointmentRepository.save(appointment);
        return "Data saved";
    }

}
