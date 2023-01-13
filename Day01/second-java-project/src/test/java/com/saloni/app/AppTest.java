package com.saloni.app;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    @Test
    public void testSayHi(){
        String expectedResult= "Hi from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.SayHi();
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void test1sayWelcome(){
        String expectedResult1= "welcome from greeting";
        Greeting greeting =new Greeting();
        String result1= greeting.sayWelcome();
        Assert.assertEquals(expectedResult1,result1);
    }

    @Test
    public void test2sayHello() {
        String expectedResult2 = "hello from greeting";
        Greeting greeting = new Greeting();
        String result2 = greeting.sayHello();
        Assert.assertEquals(expectedResult2, result2);


    }

    @Test
    public void test3sayBye(){
        String expectedResult3= "bye from greeting";
        Greeting greeting =new Greeting();
        String result3= greeting.sayBye();
        Assert.assertEquals(expectedResult3,result3);
    }
}
