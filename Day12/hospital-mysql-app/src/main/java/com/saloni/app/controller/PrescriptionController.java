package com.saloni.app.controller;

import com.saloni.app.model.Prescription;
import com.saloni.app.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/prescription")
public class PrescriptionController {
    @Autowired
    PrescriptionRepository prescriptionRepository;

    @GetMapping("/view")
    public @ResponseBody
    Iterable<Prescription> getAll() {
        return prescriptionRepository.findAll();
    }

    @PostMapping("/save")
    public @ResponseBody
    String store(@RequestBody final Prescription prescription) {
        prescriptionRepository.save(prescription);
        return " Data saved";
    }
}
