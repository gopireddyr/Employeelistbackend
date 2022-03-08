package com.Employeelistbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employeelistbackend.entity.EmpList;
import com.Employeelistbackend.repo.repositoryfile;

@CrossOrigin(origins="*")
@RestController
@Transactional
@RequestMapping("/Employeelist")
public class employeController {
	
	
	public boolean status=false;
	@Autowired
	public repositoryfile repo;
	@GetMapping("/employees")
	public List<EmpList> getallemployees()
	{
		
			return repo.findAll();
		
		
	}
	
	@GetMapping("/employee/{id}")
	public Optional<EmpList> getemp(@PathVariable("id") int id)
	{
		
			return repo.findById(id);
		
	}
	
	@PostMapping("/Addemp")
	public boolean addemployee(@RequestBody EmpList emp)
	{
				if(getemp(emp.getId()).isEmpty()) {
					repo.save(emp);			
				    return true;
				}
				else
				{
					return false;
				}
	}
	@PutMapping("/updateEmp")
	public boolean Updateemployee(@RequestBody EmpList emp)
	{
		if(!getemp(emp.getId()).isEmpty()) {
			repo.save(emp);
			return true;
			}	
		return false;
			
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public boolean deleteEmployee(@PathVariable int id)
	{
		
			repo.deleteById(id);
			return true;
		
		
	}
 
}
