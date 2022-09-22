package com.amazon.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.Entity.UserMetaData;
import com.amazon.Repository.UserRepo;
import com.codewithgargansh.blog.entities.User;
import com.codewithgargansh.blog.payloads.UserDto;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	
	public UserMetaData saveUserMetaDataTODB(UserMetaData metaData) {
		return userRepo.save(metaData);
		//return new UserMetaData();
	}

	public UserMetaData getsUserDetailsFromDB(String userId) {
		return userRepo.findAllByuniqueId(userId);
		//return new UserMetaData();
	}
	
	
	
}
