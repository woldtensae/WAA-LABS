package edu.mum.repository.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.mum.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository{
	private static HashMap<String, String> users = new HashMap<String, String>();

	static {
		users.put("Dave", "111");
		users.put("Steve", "222");
		users.put("Ralph", "333");
		
		
	}
	
	public String getPassword(String name) {
		return users.get(name);
	}
}
