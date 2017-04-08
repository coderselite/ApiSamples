package com.coders.elite.controller;

import java.util.List;
import com.coders.elite.bean.Users;
import com.coders.elite.service.UserService;
import com.coders.elite.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class UserController {
 
	 @Autowired
	 UserService userService;
	 
	 @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET, headers = "Accept=application/json")
	 public List getUsers() {	  
		 List listOfUsers = userService.getAllUsers();
		 return listOfUsers;
	 }
	 
	 @RequestMapping(value = "/getUser/id/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	 public Users getUserById(@PathVariable Integer id) {
		 return userService.getUser(id);
	 }
	 
	 @RequestMapping(value = "/getUser/mobile/{mobile}", method = RequestMethod.GET, headers = "Accept=application/json")
	 public Users getUserByMobile(@PathVariable String mobile) {
		 return userService.getUser(mobile);
	 }
	 
	 @RequestMapping(value = "/addUser", method = RequestMethod.POST, headers = "Accept=application/json")
	 public void addUser(@RequestBody Users User) { 
		 System.out.println("inside addUser controller");
		 userService.addUser(User);
	  
	 }
	 
	 @RequestMapping(value = "/updateUser", method = RequestMethod.PUT, headers = "Accept=application/json")
	 public void updateUser(@RequestBody Users User) {
		 userService.updateUser(User);
	 }
	 
	 @RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	 public void deleteUser(@PathVariable("id") int id) {
		 userService.deleteUser(id);  
	 } 
}
