package com.saloni.app.model;

import org.springframework.stereotype.Component;

@Component
public class Data {
    public Data(String id, String message) {
        this.id = id;
        this.message = message;
    }

    String id;
    String message;
    public Data(){

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "Data [id=" + id + ", message=" + message + "]";
    }



}
