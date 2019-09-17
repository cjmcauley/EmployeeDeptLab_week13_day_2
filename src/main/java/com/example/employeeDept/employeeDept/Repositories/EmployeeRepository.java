package com.example.employeeDept.employeeDept.Repositories;

import com.example.employeeDept.employeeDept.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
