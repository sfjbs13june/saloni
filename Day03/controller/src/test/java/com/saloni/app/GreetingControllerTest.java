package com.saloni.app;

//import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetingControllerTest {

    GreetingController greetingController=new GreetingController();
    @Test
    public void testGreet(){
        String expectedResult= "greet from app";
        String result=greetingController.Greet();
        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    public void testSayWelcome(){
        String expectedResult= "welcome from app";
        String result=greetingController.SayWelcome();
        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void testSayHi(){
        String expectedResult= "hi from app";
        String result=greetingController.SayHi();
        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void testSayThanks(){
        String expectedResult= "thanks from app";
        String result=greetingController.SayThanks();
        Assertions.assertEquals(expectedResult,result);
    }


}
