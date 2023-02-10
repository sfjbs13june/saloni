package com.saloni.app;

import com.saloni.app.controller.PatientController;
import com.saloni.app.model.Appointment;
import com.saloni.app.model.Prescription;
import com.saloni.app.repository.AppointmentRepository;
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

@RunWith(MockitoJUnitRunner.class)
public class PatientControllerTest {
    @InjectMocks
    PatientController patientController;
    @Mock
    AppointmentRepository appointmentRepository;
    @Mock
    Appointment appointment;
    @BeforeEach
    void setUp(){
        appointmentRepository = Mockito.mock(AppointmentRepository.class);
        appointment = Mockito.mock(Appointment.class);

    }

    @Test
    public void TestAppointments(){
        List<Appointment> getAppointment = new ArrayList<>() ;
        Prescription prescription = new Prescription("50","01","Medicine for cough and cold","abc","Doctor1");
        Appointment appointmentNew = new Appointment("01","abc","Doctor1","13/02/2023",prescription);
        getAppointment.add(appointmentNew);
        when(appointmentRepository.findByPatientName(anyString())).thenReturn(getAppointment);
        List<Appointment> result = patientController.getMyAppointments("abc");
        assertEquals(getAppointment.size(),1);

        assertEquals(getAppointment.get(0).getAppointmentId(),result.get(0).getAppointmentId());

        assertEquals(getAppointment.get(0).getDate(),result.get(0).getDate());
        assertEquals(getAppointment.get(0).getPatientName(),result.get(0).getPatientName());
        assertEquals(getAppointment.get(0).getDoctorName(),result.get(0).getDoctorName());
        assertEquals(getAppointment.get(0).getPrescription().getDescription(),result.get(0).getPrescription().getDescription());



    }

    @Test
    public void TestSaveAppointment(){
        Appointment patientAppointment = new Appointment();

        when(appointmentRepository.save(any(Appointment.class))).thenReturn(patientAppointment);
        Appointment result = patientController.saveAppointment(appointment);
        assertEquals(patientAppointment,result);



    }

}
