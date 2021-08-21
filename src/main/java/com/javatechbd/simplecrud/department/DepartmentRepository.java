package com.javatechbd.simplecrud.department;

import com.javatechbd.simplecrud.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
