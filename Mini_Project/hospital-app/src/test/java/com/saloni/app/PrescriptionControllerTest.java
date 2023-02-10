package com.saloni.app;

import com.saloni.app.controller.PrescriptionController;
import com.saloni.app.model.Prescription;
import com.saloni.app.repository.PrescriptionRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class )
public class PrescriptionControllerTest {
    @InjectMocks
    PrescriptionController prescriptionController;

    @Mock
    Prescription prescription;
    @Mock
    PrescriptionRepository prescriptionRepository;

    @BeforeEach
    void setup()
    {
        prescription = Mockito.mock(Prescription.class);
        prescriptionRepository = Mockito.mock(PrescriptionRepository.class);
    }

    @Test
    public void TestAllPrescriptions()
    {
        List<Prescription> getPrescription=new ArrayList();
        Prescription prescription1 = new Prescription("50","01","Medicine for cough and cold","abc","Doctor1");
        getPrescription.add(prescription1);

        when(prescriptionRepository.findAllByPatientName(anyString())).thenReturn(getPrescription);
        List<Prescription> result=prescriptionController.getAllPrescriptions("abc");

        assertEquals(getPrescription.get(0).getPrescriptionId(),result.get(0).getPrescriptionId());
        assertEquals(getPrescription.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(getPrescription.get(0).getPatientName(),result.get(0).getPatientName());
        assertEquals(getPrescription.get(0).getDoctorName(),result.get(0).getDoctorName());
        assertEquals(getPrescription.get(0).getDescription(),result.get(0).getDescription());

    }

    @Test
    public void TestSavePrescription() {
        Prescription saveprescription = new Prescription();
        saveprescription.setAppointmentId("01");
        saveprescription.setPrescriptionId("50");
        saveprescription.setDescription("Medicine for cough");
        saveprescription.setDoctorName("Doctor1");
        saveprescription.setPatientName("abc");
        when(prescriptionRepository.save(any(Prescription.class))).thenReturn(saveprescription);
        Prescription result = prescriptionController.savePrescription(prescription);
        assertEquals(saveprescription.getPrescriptionId(), result.getPrescriptionId());
        assertEquals(saveprescription.getAppointmentId(),result.getAppointmentId());
        assertEquals(saveprescription.getDescription(),result.getDescription());
        assertEquals(saveprescription.getDoctorName(),result.getDoctorName());
        assertEquals(saveprescription.getPatientName(),result.getPatientName());
    }





}
