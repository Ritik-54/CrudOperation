package com.ritik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ritik.entity.UserMaster;

public interface UserMasterRepository extends JpaRepository<UserMaster, Long>{

}
