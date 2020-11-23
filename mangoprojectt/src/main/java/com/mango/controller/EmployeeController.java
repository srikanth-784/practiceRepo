package com.mango.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mango.abc.modal.Employee;
import com.mango.repo.Employeerepo;

@RestController
//

public class EmployeeController {
	
	@Autowired Employeerepo repo;
	@RequestMapping(value="/save",method = RequestMethod.POST)
	ResponseEntity<Object> saveEmployee(@RequestBody Employee emp){
		
		repo.save(emp);
		return new ResponseEntity<Object>("Recods saved successfully", HttpStatus.OK);
		
	}
	

}
