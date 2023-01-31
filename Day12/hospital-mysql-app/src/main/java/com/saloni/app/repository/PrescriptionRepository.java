package com.saloni.app.repository;

import com.saloni.app.model.Prescription;
import org.springframework.data.repository.CrudRepository;

public interface PrescriptionRepository extends CrudRepository <Prescription ,Integer > {
}
