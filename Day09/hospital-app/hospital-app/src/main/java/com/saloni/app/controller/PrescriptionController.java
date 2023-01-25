package com.saloni.app.controller;

import com.saloni.app.model.Prescription;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PrescriptionController {
    @GetMapping ("/viewprescription")
    public Map getAllPrescriptions(){
        Map PrescriptionMap = new HashMap();
        Prescription prescription1 = new Prescription( "01","101","Knee Pain","Karan","Mahesh", "");
        Prescription prescription2 = new Prescription( "02","102","Stomach Pain","Ramesh","Neha", "");
        Prescription prescription3 = new Prescription( "03","103","Chest Pain","Sayali","Priti", "");


        PrescriptionMap.put(prescription1.getAppointmentId(),prescription1);

        PrescriptionMap.put(prescription2.getAppointmentId(),prescription2);

        PrescriptionMap.put(prescription3.getAppointmentId(),prescription3);

        return PrescriptionMap ;

    }

}
