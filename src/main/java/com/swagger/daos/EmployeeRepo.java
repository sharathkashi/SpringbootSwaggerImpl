package com.swagger.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swagger.entities.Employee;


@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

}
