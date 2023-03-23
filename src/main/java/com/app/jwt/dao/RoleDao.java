package com.app.jwt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.jwt.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
