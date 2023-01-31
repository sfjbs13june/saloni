package com.saloni.app.repository;

import com.saloni.app.model.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository <Appointment,Integer> {
}
