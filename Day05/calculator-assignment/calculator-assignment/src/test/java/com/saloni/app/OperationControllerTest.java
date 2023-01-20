package com.saloni.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationControllerTest {
    @Test
    public void AddTest(){
        OperationController operationController = new OperationController();
        long result = operationController.add(5,6);
        Assertions.assertEquals(result,11);
    }

    @Test
    public void SubTest(){
        OperationController operationController = new OperationController();
        long result = operationController.sub(5,6);
        Assertions.assertEquals(result,-1);

    }

    @Test
    public void MulTest(){
        OperationController operationController = new OperationController();
        long result = operationController.mul(5,6);
        Assertions.assertEquals(result,30);
    }

    @Test
    public void DivTest(){
        OperationController operationController = new OperationController();
        long result = operationController.div(30,6);
        Assertions.assertEquals(result,5);

    }
}
