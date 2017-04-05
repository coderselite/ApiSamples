package com.coders.elite.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;
 
/*
 * This is our model class and it corresponds to Country table in database
 */
@Entity
@Table(name="USERS") @Proxy(lazy = false)
public class Users{
 
 @Id
 @Column(name="id")
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 Integer id;
 
 @Column(name="firstName")
 String firstName; 
 
 @Column(name="lastName")
 String lastName;
 
 @Column(name="mobile")
 String mobile;
 
 @Column(name="otp")
 String otp;
 
 public Users() {
  super();
 }
 
 public Users(int i, String firstName, String lastName, String mobile, String otp) {
  super();
  this.id = i;
  this.firstName = firstName;
  this.lastName=lastName;
  this.mobile=mobile;
  this.otp=otp;
 }
 
 public int getId() {
  return id;
 }
 
 public void setId(int id) {
  this.id = id;
 }
 
 public String getFirstName() {
  return firstName;
 }
 
 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 public String getLastName() {
  return lastName;
  }
	 
 public void setLastName(String lastName) {
  this.lastName = lastName;
  }
	 
 public String getMobile() {
  return mobile;
  }
		 
public void setMobile(String mobile) {
 this.mobile = mobile;
 }

public String getOtp() {
 return otp;
 }
			 
public void setOtp(String otp) {
 this.otp = otp;
 }
 
}
 
