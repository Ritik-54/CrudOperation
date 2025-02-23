package com.ritik.services;

import com.ritik.entity.UserMaster;

public interface IUserMasterService {
	

	UserMaster addUser(UserMaster userMaster);
	UserMaster updateUser(Long id,UserMaster user);
	void deleteUser(Long id);

}
