package com.cognizant.springlearn.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="Country not found")
public class CountryNotFoundException extends Exception {

	@Override
	public String getMessage()
	{
		return "ClassNotFound";
	}
}
