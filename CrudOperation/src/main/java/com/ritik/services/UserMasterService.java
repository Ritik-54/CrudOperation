package com.ritik.services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ritik.entity.UserMaster;
import com.ritik.repository.UserMasterRepository;

@Service
public class UserMasterService implements IUserMasterService{
	
	
	@Autowired
	public UserMasterRepository userMastercRepository;

	@Override
	public UserMaster addUser(UserMaster userMaster) {
		return userMastercRepository.save(userMaster);
	}

	@Override
	public UserMaster updateUser(Long id, UserMaster user) {
  Optional<UserMaster>user1=userMastercRepository.findById(id);
  if(user1.isPresent()) {
	  UserMaster usermaster  = user1.get();
	  usermaster.setUsername(user.getUsername());
	  usermaster.setCreatedBy(user.getCreatedBy());
	  usermaster.setStatus(user.getStatus());
	  usermaster.setPassword(user.getPassword());
	  return userMastercRepository.save(usermaster);
  }
		return null ;
	}

	@Override
	public void deleteUser(Long id) {
		userMastercRepository.deleteById(id);
	}
	

}
