package com.example.demo.Domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Column(name="custname", nullable=false,length=100)
	private String custname;
	@Id
	@Column(name="custid", nullable=false,length=100)
	private String custid;
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	
	public String getCustphoneno() {
		return custphoneno;
	}
	public void setCustphoneno(String custphoneno) {
		this.custphoneno = custphoneno;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public Date getCustdob() {
		return custdob;
	}
	public void setCustdob(Date custdob) {
		this.custdob = custdob;
	}
	@Column(name="custphoneno", nullable=false,length=100)
	private String custphoneno;
	@Column(name="passwd", nullable=false,length=100)
	private String passwd;
	@Column(name="custdob")
	private Date custdob;

}
