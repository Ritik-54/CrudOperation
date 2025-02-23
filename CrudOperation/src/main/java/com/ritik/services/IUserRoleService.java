package com.ritik.services;

import com.ritik.entity.UserRole;

public interface IUserRoleService {


	UserRole addUserRole(UserRole userRole);
	UserRole updateRole(Long id, UserRole userRole);
	void deleteRole(Long id);

}
