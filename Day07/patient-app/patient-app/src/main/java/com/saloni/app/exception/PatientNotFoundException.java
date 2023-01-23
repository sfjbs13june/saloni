package com.saloni.app.exception;



public class PatientNotFoundException extends Exception {
    String message;
  public PatientNotFoundException(String message) {
        super(message);

    }


   // @Override
  //  public String getMessage() {
   //     return message;
   // }

   // public void setMessage(String message) {
  //      this.message = message;
  //  }

   // public PatientNotFoundException(String message) {
   //     this.message = message;
   // }

   // public PatientNotFoundException() {
   // }
}