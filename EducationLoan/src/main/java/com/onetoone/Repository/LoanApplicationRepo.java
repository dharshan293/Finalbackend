package com.onetoone.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.onetoone.Model.LoanApplicationModel;


public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel,Integer>{


}
