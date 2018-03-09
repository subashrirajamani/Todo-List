package com.example.demo.Dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.Domain.Customer;

@Transactional
public interface CustomerInfo extends CrudRepository<Customer,String> {
	@Query("SELECT a FROM Customer a WHERE a.custid=:id AND a.passwd=:passwd")
	Customer findByEmailAndPassword(@Param("id")String id, @Param("passwd")String passwd);
	
}
