package com.ritik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ritik.entity.UserMaster;
import com.ritik.services.IUserMasterService;

@RestController
@RequestMapping("/user")
public class UserMasterController {
	
	@Autowired
	public IUserMasterService iUserMasterService;
	
	
	@PostMapping("/add")
	 public String addUser(@RequestBody UserMaster userMaster) {
		UserMaster userMaster2 = iUserMasterService.addUser(userMaster);
		return "User Added Successfully";
		 
	 }
	@PutMapping("/update/{id}")
public String updateUser(@PathVariable Long id,@RequestBody UserMaster user) {
	UserMaster userMaster2=	iUserMasterService.updateUser(id,user);
	return "ok";

	}

	
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable Long id) {
		iUserMasterService.deleteUser(id);
		return "Deleted";
		
	}



}
