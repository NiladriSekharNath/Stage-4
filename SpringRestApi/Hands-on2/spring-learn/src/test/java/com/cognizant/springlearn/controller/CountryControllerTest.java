package com.cognizant.springlearn.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;


class CountryControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void testgetCountry() throws Exception
	{
		
		//assertTrue(true);
		ResultActions actions = mvc.perform(get("/country"));
		
		//actions.andExpect(status().isOk());
		//actions.andExpect(jsonPath("$.code").exists());
		//actions.andExpect(jsonPath("$.code").value("IN"));
		//actions.andExpect(jsonPath("$.name").exists());
		//actions.andExpect(jsonPath("$.name").value("India"));
		//actions.andExpect(status().isBadRequest());
		//actions.andExpect(status().reason("Country Not found"));
		
		
		
	}

}
