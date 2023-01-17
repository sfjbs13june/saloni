package com.saloni.app;

import org.junit.Assert;
import org.junit.Test;

public class HelloControllerTest {

    @Test
    public void testSayHello(){
        String expectedResult= "Hello From App";
        HelloController helloController = new HelloController();
        String result= helloController.SayHello();
        Assert.assertEquals(expectedResult,result);


    }

    @Test
    public void testSayRequestHello(){
        String expectedResult1= "Hello From Request Mapping";
        HelloController helloController = new HelloController();
        String result1= helloController.requestHello();
        Assert.assertEquals(expectedResult1,result1);

    }

    @Test
    public void testRequestWelcome1(){
        String name = "world";
        String expectedResult1= "Welcome to "+name;
        HelloController helloController = new HelloController();
        String result1= helloController.welcome1(name);
        Assert.assertEquals(expectedResult1,result1);

    }




    @Test
    public void testRequestSendMessage(){
        String message = "world";
        String expectedResult1= "send message "+message;
        HelloController helloController = new HelloController();
        String result1= helloController.sendMessage(message);
        Assert.assertEquals(expectedResult1,result1);

    }

}
