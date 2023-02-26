package com.cg.hbm.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hbm.entity.User;


@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{

	//User getUserId(int userId);
	

}