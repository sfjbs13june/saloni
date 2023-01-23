package com.saloni.app.controller;

import com.saloni.app.exception.*;
import com.saloni.app.model.Patient;
import com.saloni.app.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {
    @Value("${app.name}")
    String name;

    @Autowired
    PatientService patientService;
    @PostMapping ("/patient/save")
    public Patient savePatient(@RequestBody Patient patient) throws PatientNotFoundException, NameNotFoundException, AgeNotFoundException, GenderNotFoundException, DiseaseNotFoundException {
        if(patient.getId()==null){
            throw new PatientNotFoundException("There is no patient available");
        }
        if(patient.getName()==null){
            throw new NameNotFoundException("Patient name not available");
        }
        if(patient.getAge()==null){
            throw new AgeNotFoundException("Patient age not available");
        }
        if(patient.getGender()==null){
            throw new GenderNotFoundException("Patient gender not available");
        }
        if(patient.getDisease()==null){
            throw new DiseaseNotFoundException("Patient disease not available") ;
        }
        System.out.println(name);
        System.out.println(patient);
        return patient;
    }

    @PutMapping ("/patient/update")
    public Patient updatePatient(@RequestBody Patient patient, @RequestParam("disease") String disease){

        return patientService.updateDetail(patient,disease);
    }

}
