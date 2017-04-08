package com.coders.elite.bean;

import java.io.Serializable;

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
public class Users implements Serializable{
 
 @Id
 @Column(name="id")
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Integer id;
 
 @Column(name="firstName")
 private String firstName; 
 
 @Column(name="lastName")
 private String lastName;
 
 @Column(name="mobile")
 private String mobile;
 
 @Column(name="otp")
 private String otp;
 
 @Column(name="referralCode")
 private String referralCode;
 
 
 
 public Users() {
  super();
 }
 
 public Users(int i, String firstName, String lastName, String mobile, String otp, String referralCode ) {
  super();
  this.id = i;
  this.firstName = firstName;
  this.lastName=lastName;
  this.mobile=mobile;
  this.otp=otp;
  this.referralCode=referralCode;
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

public String getReferralCode() {
	return referralCode;
}

public void setReferralCode(String referralCode) {
	this.referralCode = referralCode;
}
 

}
 
