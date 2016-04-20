package com.aws.gcp.css.dao.user;

import com.aws.gcp.css.dao.Dao;
import com.aws.gcp.css.entity.User;

import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserDao extends Dao<User, Long>, UserDetailsService
{

	User findByName(String name);

}