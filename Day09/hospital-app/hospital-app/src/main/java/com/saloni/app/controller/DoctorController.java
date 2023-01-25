package com.saloni.app.controller;

import com.saloni.app.model.Prescription;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping ("/doctor")
public class DoctorController {
    @GetMapping("/doctorappointment")
    public Map getAllDoctors(){
        Map PrescriptionMap = new HashMap();
        Prescription prescription1 = new Prescription( "01","101","Knee Pain","Karan","Mahesh","abc");
        Prescription prescription2 = new Prescription( "02","102","Stomach Pain","Ramesh","Neha","pqr");
        Prescription prescription3 = new Prescription( "03","103","Chest Pain","Sayali","Priti", "wer");


        PrescriptionMap.put(prescription1.getAppointmentId(),prescription1);

        PrescriptionMap.put(prescription2.getAppointmentId(),prescription2);

        PrescriptionMap.put(prescription3.getAppointmentId(),prescription3);

        return PrescriptionMap ;

    }

    @PutMapping ("/saveprescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){


        return prescription;
    }


}
