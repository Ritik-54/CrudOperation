package com.ritik.services;

import com.ritik.entity.UserRoleMapping;

public interface IUserRoleMappingService {
	

	UserRoleMapping addUserRoleMapping(UserRoleMapping userRoleMapping);
	UserRoleMapping updaRoleMapping(Long id, UserRoleMapping userRoleMapping);
	void deleteUserRoleMapping(Long id);

}
