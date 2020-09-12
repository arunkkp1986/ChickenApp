package com.control.chickenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table
public class User{
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column
  private Integer id;

  @Column
  private String mobileNo;

  @Column
  private String password;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getMobileNo() {
	return mobileNo;
}

public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "User [id=" + id + ", mobileNo=" + mobileNo + ", password=" + password + "]";
}

}
