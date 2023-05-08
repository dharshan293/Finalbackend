package com.onetoone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetoone.Model.AdminModel;


public interface AdminRepo extends JpaRepository<AdminModel,String>{

}
