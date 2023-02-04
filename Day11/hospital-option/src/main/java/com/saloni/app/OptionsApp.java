package com.saloni.app;



import com.saloni.app.model.Hospital;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionsApp {
    public Optional<Hospital> getHospital(String name){

        Hospital hospital1= new Hospital("h1","abc");
        Hospital hospital2=new Hospital("h2","xyz");
        Map<String, Hospital> data = new HashMap<>();
        data.put("h1", hospital1);
        data.put("h2", hospital2);
        Hospital result= data.get(name);
        return Optional.ofNullable(result);

    }
}
