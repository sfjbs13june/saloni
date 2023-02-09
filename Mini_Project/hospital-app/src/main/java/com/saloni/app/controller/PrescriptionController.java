package com.saloni.app.controller;


import com.saloni.app.model.Prescription;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class PrescriptionController {
    @GetMapping("/viewprescription")

    public List<Prescription> getAllPrescriptions(String patientName){
        return prescriptionRepo.findAllByPatientName(patientName);

    }

    @PostMapping("/saveprescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){
        prescription = prescriptionRepo.save(prescription);
        return prescription;

    }

}
