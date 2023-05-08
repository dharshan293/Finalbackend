package com.onetoone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetoone.Model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel,String>{

}
