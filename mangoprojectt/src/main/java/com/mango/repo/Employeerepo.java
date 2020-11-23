package com.mango.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mango.abc.modal.Employee;
@Repository
public interface Employeerepo extends MongoRepository<Employee, Integer>{

}
