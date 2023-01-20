package com.saloni.app;

import org.junit.Test;
//import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class )
@WebMvcTest(OperationController.class)
public class OperationControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void TestAdd() throws Exception{
        long a = (long) 10.0;
        long b = (long) 5.0;
        ResultActions response = mockMvc.perform(get("/add").param("a", String.valueOf(a)).param("b", String.valueOf(b)));
        response.andExpect(status().isOk());
        String result = response.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals(result,"15");

    }
    @Test
    public void TestSub() throws Exception{
        long a = (long) 10.0;
        long b = (long) 7.0;
        ResultActions response = mockMvc.perform(post(  "/sub").param("a", String.valueOf(a)).param("b", String.valueOf(b)));
        response.andExpect(status().isOk());
        String result = response.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals(result,"3");

    }

    @Test
    public void TestMul() throws Exception{
        long a = (long) 30.0;
        long b = (long) 5.0;
        ResultActions response = mockMvc.perform(put( "/mul").param("a", String.valueOf(a)).param("b", String.valueOf(b)));
        response.andExpect(status().isOk());
        String result = response.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals(result,"150");

    }

    @Test
    public void TestDiv() throws Exception
    {
        long a = (long) 10.0;
        long b = (long) 5.0;
        ResultActions response = mockMvc.perform(delete("/div").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
        response.andExpect((status().isOk()));
        String result = response.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals(result,"2");
    }

}
