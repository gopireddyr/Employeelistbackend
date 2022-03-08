package com.Employeelistbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Employeelistbackend.entity.EmpList;

@Repository
public interface repositoryfile extends JpaRepository<EmpList, Integer> {

	
}
