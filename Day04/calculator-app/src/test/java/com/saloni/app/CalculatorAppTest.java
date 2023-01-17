package com.saloni.app;

//import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorAppTest {
    CalculatorApp calculatorApp = new CalculatorApp();

    @Test
    public void testAdd(){
        double a = 10.0;
        double b = 2.0;
        double expectedResult= 12.0;
        double result=calculatorApp.add(a,b);
        Assertions.assertEquals(expectedResult, result, 0.00);
    }
    @Test
    public void testSub(){
        double a = 10.0;
        double b = 2.0;
        double expectedResult= 8.0;
        double result=calculatorApp.sub(a,b);
        Assertions.assertEquals(expectedResult, result, 0.00);
    }
    @Test
    public void testMul(){
        double a = 10.0;
        double b = 2.0;
        double expectedResult= 20.0;
        double result=calculatorApp.mul(a,b);
        Assertions.assertEquals(expectedResult, result, 0.00);
    }
    @Test
    public void testDiv(){
        double a = 10.0;
        double b = 2.0;
        double expectedResult= 5.0;
        double result=calculatorApp.div(a,b);
        Assertions.assertEquals(expectedResult, result, 0.00);
    }
}
