package com.songs.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.songs.module.UserModule;

public interface SongRepo extends CrudRepository<UserModule, Integer> {
	
	@Query(value="select distinct * from songs.user_module where number=:number or email=:email",nativeQuery = true)
	UserModule login(@Param("number") String number,@Param("email") String email);

	@Query(value="select distinct * from songs.user_module where number=:number or email=:email",nativeQuery = true)
	UserModule update(@Param("number") String number,@Param("email") String email);

}
