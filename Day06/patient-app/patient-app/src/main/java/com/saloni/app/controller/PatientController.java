package com.saloni.app.controller;

import com.saloni.app.model.Patient;
import com.saloni.app.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;
    @PostMapping ("/patient/save")
    public Patient savePatient(@RequestBody Patient patient){
        System.out.println(patient);
        return patient;
    }

    @PutMapping ("/patient/update")
    public Patient updatePatient(@RequestBody Patient patient, @RequestParam("disease") String disease){

        return patientService.updateDetail(patient,disease);
    }

}
