package com.rama.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MyClassCTest {
    @InjectMocks
    MyClassC myclassC;

    @Test
    public void TestGetMyAge() {
        int result = myclassC.getMyAge(25);
        assertEquals(25, result);
    }
    @Test
    public void TestGeTData2() {
        String result = myclassC.getData2("Bye");
        assertEquals("Bye", result);
    }
}
