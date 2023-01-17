package com.saloni.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;


import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@RunWith(SpringRunner.class)
@WebMvcTest({CalculatorApp.class})
public class CalculatorAppIntegrationTest {

    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testCalculatorAppAdd() throws Exception {
        String a="10.0";
        String b="2.0";
        ResultActions responseEntity  = mockMvc.perform(get("/add").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals("12.0", result);
    }

    @Test
    public void testCalculatorAppSub() throws Exception {
        String a="10.0";
        String b="2.0";
        ResultActions responseEntity  = mockMvc.perform(get("/sub").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals("8.0", result);
    }

    @Test
    public void testCalculatorAppMul() throws Exception {
        String a="10.0";
        String b="2.0";
        ResultActions responseEntity  = mockMvc.perform(get("/mul").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals("20.0", result);
    }

    @Test
    public void testCalculatorAppDiv() throws Exception {
        String a="10.0";
        String b="2.0";
        ResultActions responseEntity  = mockMvc.perform(get("/div").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals("5.0", result);
    }

}
