package com.ritik.services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ritik.entity.UserRole;
import com.ritik.repository.UserRoleRepository;

@Service
public class UserRoleService implements IUserRoleService{
	
	@Autowired
	public UserRoleRepository userRoleRepository;

	@Override
	public UserRole addUserRole(UserRole userRole) {
		return userRoleRepository.save(userRole);
	}

	@Override
	public UserRole updateRole(Long id, UserRole userRole) {
		Optional<UserRole> userOptional = userRoleRepository.findById(id);
		if(userOptional.isPresent()) {
			UserRole userRole1 = userOptional.get();
			userRole1.setName(userRole.getName());
			userRole1.setStatus(userRole.getStatus());
			return userRoleRepository.save(userRole1);
			
		}
		return null;
	}

	@Override
	public void deleteRole(Long id) {
		userRoleRepository.deleteById(id);
		
	}

}
