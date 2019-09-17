package com.example.employeeDept.employeeDept.Repositories;

import com.example.employeeDept.employeeDept.Models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
