package com.app.jwt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.jwt.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
