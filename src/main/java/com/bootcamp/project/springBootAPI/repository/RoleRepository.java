package com.bootcamp.project.springBootAPI.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.project.springBootAPI.model.Role;
import com.bootcamp.project.springBootAPI.model.RoleType;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
	Optional<Role> findByName(RoleType roleName);
}