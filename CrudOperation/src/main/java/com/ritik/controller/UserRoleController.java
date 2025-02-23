package com.ritik.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ritik.entity.UserRole;
import com.ritik.services.IUserRoleService;

@RestController
@RequestMapping("/user/role")
public class UserRoleController {
	
	@Autowired
	public IUserRoleService iUserRoleService;
	
	
	@PostMapping("/add")
	public String addUserRole(@RequestBody UserRole userRole) {
		UserRole userRole2 = iUserRoleService.addUserRole(userRole);
		return "User Role Added Successfully";	
	}
	
	@PutMapping("/update/{id}")
	public String updateUserRole(@PathVariable long id, @RequestBody UserRole userRole) {
		UserRole userRole2 = iUserRoleService.updateRole(id, userRole);
		return "Update Successfully";	
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deletUserRole(@PathVariable long id) {
		iUserRoleService.deleteRole(id);
		return "Deleted successfully";
		
	}
	
	
	
	
	
	
	
	

}
