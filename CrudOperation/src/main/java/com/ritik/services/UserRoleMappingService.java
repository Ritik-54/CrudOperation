package com.ritik.services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ritik.entity.UserRoleMapping;
import com.ritik.repository.UserRoleMappingRepository;

@Service
public class UserRoleMappingService implements IUserRoleMappingService{
	
	
	@Autowired
	public UserRoleMappingRepository userRoleMappingRepository;

	@Override
	public UserRoleMapping addUserRoleMapping(UserRoleMapping userRoleMapping) {
		return userRoleMappingRepository.save(userRoleMapping);
	}

	@Override
	public UserRoleMapping updaRoleMapping(Long id, UserRoleMapping userRoleMapping) {
		Optional<UserRoleMapping> userOptional = userRoleMappingRepository.findById(id);
		if(userOptional.isPresent()) {
			UserRoleMapping userRoleMapping2 = userOptional.get();
			userRoleMapping2.setRole_id(userRoleMapping.getRole_id());
			userRoleMapping2.setUser_id(userRoleMapping.getUser_id());
			return userRoleMappingRepository.save(userRoleMapping2);
		}
		return null;
	}

	@Override
	public void deleteUserRoleMapping(Long id) {
		userRoleMappingRepository.deleteById(id);
	}

}
