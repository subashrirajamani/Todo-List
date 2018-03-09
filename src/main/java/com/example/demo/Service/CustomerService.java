package com.example.demo.Service;

import com.example.demo.Model.CustomerRegisterTO;
import com.example.demo.Model.CustomerTO;

public interface CustomerService {

	CustomerTO login(String custid, String passwd);
	
	String register(CustomerRegisterTO cust);
	
}
