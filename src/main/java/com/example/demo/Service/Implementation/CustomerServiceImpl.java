package com.example.demo.Service.Implementation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.CustomerInfo;
import com.example.demo.Domain.Customer;
import com.example.demo.Model.CustomerRegisterTO;
import com.example.demo.Model.CustomerTO;
import com.example.demo.Service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerInfo custinfo;
	
	@Override
	public CustomerTO login(String custid, String passwd) {
		// TODO Auto-generated method stub
		Customer c=custinfo.findByEmailAndPassword(custid, passwd);
		CustomerTO t=new CustomerTO();
		if(c!=null)
		{
						
			t.setEmailid(c.getCustid());
			t.setName(c.getCustname());
			t.setPhoneno(c.getCustphoneno());
			return t;
		
	
		}
		else
		{
			t.setEmailid("invalid");
			return t;
		}
	}

	@Override
	public String register(CustomerRegisterTO cust) {
		if(cust!=null) {
		SimpleDateFormat sddob=new SimpleDateFormat("yyyy-MM-dd");	
		Customer cus=new Customer();
		try {
			cus.setCustdob(sddob.parse(cust.getCustdob()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cus.setCustid(cust.getCustid());
		cus.setCustname(cust.getCustname());
		cus.setCustphoneno(cust.getCustphoneno());
		cus.setPasswd(cust.getPasswd());
		custinfo.save(cus);
		return "success";
		// TODO Auto-generated method stub
		}
		else
		{
			return "failure";
		}
	
	}

}
