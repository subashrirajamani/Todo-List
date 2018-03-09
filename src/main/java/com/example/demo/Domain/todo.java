package com.example.demo.Domain;

import java.util.Date;
import com.example.demo.Domain.Customer;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="todo")
public class todo {
	@Column(name="custname", nullable=false,length=100)
	private String custname;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="custid")
	private Customer custid;
	@Column(name="message", nullable=false,length=200)
	private String message;
	@Column(name="status", nullable=false,length=50)
	private String passwd;
	@Id
	@Column(name="date")
	private Date date;

}
