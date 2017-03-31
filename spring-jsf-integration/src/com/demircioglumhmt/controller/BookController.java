package com.demircioglumhmt.controller;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demircioglumhmt.service.BookImpl;

@Component
@ManagedBean(value="bookBean")
@SessionScoped
public class BookController {
	
	@Autowired
	private BookImpl bookImpl;

	public String getMessage()
	{
		return bookImpl.getMessage();
	}

}
