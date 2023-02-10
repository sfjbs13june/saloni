package com.saloni.app.controller;


import com.saloni.app.model.Prescription;
import com.saloni.app.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class PrescriptionController {
    @Autowired
    PrescriptionRepository prescriptionRepository;
    @GetMapping("/viewprescription")

    public List<Prescription> getAllPrescriptions(String patientName){
        return prescriptionRepository.findAllByPatientName(patientName);

    }

    @PostMapping("/saveprescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){
        prescription = prescriptionRepository.save(prescription);
        return prescription;

    }

}
