package com.amazon.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amazon.Entity.UserMetaData;
import com.codewithgargansh.blog.entities.Post;
import com.codewithgargansh.blog.entities.User;

@Repository
public interface UserRepo extends CrudRepository<UserMetaData, Long>{

	UserMetaData save(UserMetaData userdata);
	UserMetaData findAllByuniqueId(String uniqueId);
	
	
}