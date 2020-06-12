package com.cognizant.springlearn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.service.CountryService;

@RestController
public class CountryController {

	@Autowired
	CountryService countryService;
	
	
	@GetMapping("/country")
	public Country getCountryIndia()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("country",Country.class);
		
		return country;
	}
	
	@GetMapping("/countries")
	public List<Country> getAllCountries()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> countries =(ArrayList<Country>) context.getBean("countryList");
		
		return countries;
		
	}
	
	@GetMapping("/countries/{code}")
	public @ResponseBody Country getCountry(@PathVariable String code) throws CountryNotFoundException
	{
		return countryService.getCountry(code);
	}
}
