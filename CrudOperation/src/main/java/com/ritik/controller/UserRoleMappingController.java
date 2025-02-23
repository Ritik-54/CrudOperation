package com.ritik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ritik.entity.UserRoleMapping;
import com.ritik.services.IUserRoleMappingService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user/rolemapping")
public class UserRoleMappingController {
	
	@Autowired
	public IUserRoleMappingService iUserRoleMappingService;
	
	
	@PostMapping("/add")
	public String addUserRoleMapping(@RequestBody UserRoleMapping userRoleMapping) {
		UserRoleMapping userRoleMapping2 = iUserRoleMappingService.addUserRoleMapping(userRoleMapping);
		return "User Role Mapping Added";
	}
	
	@PutMapping("update/{id}")
	public String updateUserRoleMapping(@PathVariable long id, UserRoleMapping userRoleMapping) {
		UserRoleMapping userRoleMapping2 = iUserRoleMappingService.updaRoleMapping(id, userRoleMapping);
		return "Updated Successfully";
	}
	
	
	@DeleteMapping("delete/{id}")
	public String deleteUserRoleMapping(@PathVariable long id) {
		iUserRoleMappingService.deleteUserRoleMapping(id);
		return "Deleted Successfully";
		
	}
	

}
