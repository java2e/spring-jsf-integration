package com.demircioglumhmt.service;

import org.springframework.stereotype.Service;

import com.demircioglumhmt.IBook;

@Service
public class BookImpl implements IBook {
	
	public String getMessage()
	{
		return "Hello JSF2+Spring Integartion";
	}

}
