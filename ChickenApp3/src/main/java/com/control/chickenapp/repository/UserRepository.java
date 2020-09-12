package com.control.chickenapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.control.chickenapp.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	public List<User> findByMobileNoAndPassword(String mobileNo, String Password);
}
