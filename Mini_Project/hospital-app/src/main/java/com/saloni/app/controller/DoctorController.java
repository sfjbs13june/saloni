package com.saloni.app.controller;

import com.saloni.app.model.Appointment;
import com.saloni.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/doctor")
public class DoctorController {

    @Autowired
    AppointmentRepository appointmentRepository;

    @GetMapping("/doctorappointment")
    public List<Appointment> getAppointments(@RequestParam String doctorName){
        return appointmentRepository.findByDoctorName(doctorName);

    }
    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        appointment = appointmentRepository.save(appointment);
        return appointment;

    }

}
