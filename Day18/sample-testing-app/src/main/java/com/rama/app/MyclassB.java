package com.rama.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyclassB {
    @Autowired
    MyClassC myClassC;


    public String getResult(){
        return "my result";
    }

    public String getMyString(String data){
        return "my result"+data;
    }

    public int getClassCResult(MyClassC myClassC){
        return  myClassC.getMyAge(35);
    }

    public void NoreturnData(String data){
        System.out.println(myClassC.getData2("hi"));

    }

}
