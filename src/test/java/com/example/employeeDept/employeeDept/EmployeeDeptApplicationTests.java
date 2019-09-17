package com.example.employeeDept.employeeDept;

import com.example.employeeDept.employeeDept.Models.Department;
import com.example.employeeDept.employeeDept.Models.Employee;
import com.example.employeeDept.employeeDept.Models.Project;
import com.example.employeeDept.employeeDept.Repositories.DepartmentRepository;
import com.example.employeeDept.employeeDept.Repositories.EmployeeRepository;
import com.example.employeeDept.employeeDept.Repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeDeptApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Department department = new Department("IT");
		departmentRepository.save(department);
		Employee employee = new Employee("Bob", "Smith", 235235, department);
		employeeRepository.save(employee);
		Project project = new Project("IT Project", 10);
		projectRepository.save(project);
		project.addEmployeeToProject(employee);
		projectRepository.save(project);
	}



}
