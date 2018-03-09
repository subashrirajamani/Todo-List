package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CustomerRegisterTO;
import com.example.demo.Model.CustomerTO;
import com.example.demo.Service.CustomerService;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {
	@Autowired
	private CustomerService service;
	@RequestMapping(value="/login/{id}/{passwd}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public CustomerTO login(@PathVariable(value="id")String id,@PathVariable(value="passwd")String passwd)
	{
		return service.login(id, passwd);
	}
	@RequestMapping(value="/register",method=RequestMethod.POST,produces=MediaType.TEXT_PLAIN_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public String register(@RequestBody CustomerRegisterTO registo)
	{
		return service.register(registo);
	}
}
