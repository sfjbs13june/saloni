package com.rama.app;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MyClassBTest {

    @InjectMocks
    MyclassB myclassB;

    @Mock
    MyClassC myclassC;

    @Mock
    MyclassA myClassA;

    @BeforeEach
    void setUp(){
        myclassC= Mockito.mock(MyClassC.class);
        myClassA= Mockito.mock(MyclassA.class);
    }

    @Test
    public void TestGetResult() {
        String result = myclassB.getResult();
        assertEquals("my result", result);
    }
    @Test
    public void TestGetMyString() {
        String result = myclassB.getMyString("data");
        assertEquals("my result"+"data", result);
    }

    @Test
    public void TestGetClassCResult() {
        when(myclassC.getMyAge(anyInt())).thenReturn(30);
        int result = myclassB.getClassCResult(myclassC);
        assertEquals(30, result);
    }
    @Test
    public void TestNoReturnData() {
        myclassB.NoreturnData("hello");
        verify(myclassC, atLeast(1)).getData2("hi");
    }
}
