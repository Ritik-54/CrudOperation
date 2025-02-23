package com.ritik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ritik.entity.UserRoleMapping;

public interface UserRoleMappingRepository extends JpaRepository<UserRoleMapping, Long>{

}
