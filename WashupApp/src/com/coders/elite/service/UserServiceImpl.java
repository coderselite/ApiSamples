package com.coders.elite.service;

import java.util.List;
import com.coders.elite.dao.UserDAOImpl;
import com.coders.elite.bean.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service("userService")
public class UserServiceImpl implements UserService {
 
	 @Autowired
	 UserDAOImpl userDao;
	 
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
}