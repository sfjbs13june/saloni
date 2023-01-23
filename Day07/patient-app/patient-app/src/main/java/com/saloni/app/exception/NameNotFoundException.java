package com.saloni.app.exception;
import com.saloni.app.model.Patient;
public class NameNotFoundException extends Throwable {
    public NameNotFoundException(String message) {
        super(message);
    }
}
