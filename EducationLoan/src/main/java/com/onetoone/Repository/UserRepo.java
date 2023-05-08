package com.onetoone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetoone.Model.UserModel;


public interface UserRepo extends JpaRepository<UserModel,Integer>{

}
