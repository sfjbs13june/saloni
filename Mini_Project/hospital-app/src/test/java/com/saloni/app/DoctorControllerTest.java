package com.saloni.app;

import com.saloni.app.controller.DoctorController;
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
@RunWith(MockitoJUnitRunner.class )
public class DoctorControllerTest {
    @InjectMocks
    DoctorController doctorController;

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
        List<Appointment>getAppointment = new ArrayList<>() ;
        Appointment appointment1 = new Appointment();
        Prescription prescription1 = new Prescription("500","01","Medicine for cough and fever","abc","Doctor1");

        appointment1.setAppointmentId("01");
        appointment1.setDate("13/02/2023");
        appointment1.setPatientName("abc");
        appointment1.setDoctorName("Doctor1");
        appointment1.setPrescription(prescription1);
        getAppointment.add(appointment1);
        when(appointmentRepository.findByDoctorName(anyString())).thenReturn(getAppointment);
        List<Appointment>result = doctorController.getAppointments("Doctor1");
        assertEquals(getAppointment.size(),1);
        assertEquals(getAppointment.get(0).getAppointmentId(),result.get(0).getAppointmentId());assertEquals(getAppointment.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(getAppointment.get(0).getDate(),result.get(0).getDate());
        assertEquals(getAppointment.get(0).getPatientName(),result.get(0).getPatientName());
        assertEquals(getAppointment.get(0).getDoctorName(),result.get(0).getDoctorName());
        assertEquals(getAppointment.get(0).getPrescription().getDescription(),result.get(0).getPrescription().getDescription());


    }

    @Test
    public void TestSaveAppointments(){
        Appointment appointment2 = new Appointment();
        appointment2.setAppointmentId("05");
        appointment2.setDate("15/02/2023");
        appointment2.setPatientName("pqr");
        appointment2.setDoctorName("Doctor2");
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(appointment2);
        Appointment result = doctorController.saveAppointment(appointment);
        assertEquals(appointment2.getAppointmentId(),result.getAppointmentId());
        assertEquals(appointment2.getDate(),result.getDate());
        assertEquals(appointment2.getPatientName(),result.getPatientName());
        assertEquals(appointment2.getDoctorName(),result.getDoctorName());


    }

}
