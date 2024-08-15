package com.Hotal.Error;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Advice {

	@ResponseBody
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(Notfound.class)
	public Map<String,String> Enable(Notfound nf)
	{
		Map<String,String> map=new HashMap<String,String>();
		map.put("Error Message", nf.toString());
		return map;
	}
}
