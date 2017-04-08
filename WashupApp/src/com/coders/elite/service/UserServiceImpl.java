package com.coders.elite.service;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

import com.coders.elite.dao.UserDAOImpl;
import com.coders.elite.bean.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service("userService")
public class UserServiceImpl implements UserService {
 
	@Autowired
	UserDAOImpl userDao;
	private Users user;
	private String referralCode;
	 
	 @Transactional
	 public List getAllUsers() {
		 return userDao.getAllUsers();
	 }
	 
	 @Transactional
	 public Users getUser(Integer id) {
		 return userDao.getUser(id);
	 }
	 
	 @Transactional
	 public Users getUser(String mobile) {
		 return userDao.getUser(mobile);
	 }
	 
	 @Transactional
	 public void addUser(Users user) {
		 System.out.println("inside ad user service");
		 user.setReferralCode(verifyReferralCode());
		 userDao.addUser(user);
	 }
	 
	 @Transactional
	 public void updateUser(Users user) {
		 userDao.updateUser(user);
	 }
	 
	 @Transactional
	 public void deleteUser(int id) {
		 userDao.deleteUser(id);
	 }
	 
	 @Transactional
	 public String validateUser(String mobile){
		 Users user = this.getUser(mobile);
		 if (user != null)
		 {
			 return "Registered User";
		 }
		 else
		 {
			 //OTP code
			 return "New User";
		 }
	 }
	 
	 /*
	  *@see com.coders.elite.service.UserService#generateReferralCode()
	  * Method generates random referral code of length 8 bits
	  */
	 @Transactional
	 public String generateReferralCode(){
		 char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
	     StringBuilder sb = new StringBuilder();
	     Random random = new SecureRandom();
	     for (int i = 0; i < 8; i++) {
	    	 char c = chars[random.nextInt(chars.length)];
	         sb.append(c);
	     }
	     String output = sb.toString();
	     System.out.println(output);
	     return output ;
	 }
	 
	 /*
	  * @see com.coders.elite.service.UserService#verifyReferralCode()
	  * Method to check the uniqueness of code in database
	  */
	 @Transactional
	 public String verifyReferralCode(){
		do{
			 this.referralCode = this.generateReferralCode();
			 this.user = (Users) userDao.verifyReferralCode(this.referralCode);
		 }
		 while( this.user != null );
		 return referralCode;
	 }
}
