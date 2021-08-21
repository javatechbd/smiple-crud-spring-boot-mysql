package com.javatechbd.simplecrud.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public void createEmployee(EmployeeDTO employeeDTO) {

        Employee employee = new Employee();
        employee.setId(UUID.randomUUID().toString());
        employee.setName(employeeDTO.getName());
        employee.setMobile(employeeDTO.getMobile());
        employee.setSalary(employeeDTO.getSalary());
        employee.setCreatedAt(LocalDateTime.now());
        employeeRepository.save(employee);
    }

    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepository.findById(id);
    }

    public void updateEmployee(String id, EmployeeDTO employeeDTO ) {

        employeeRepository.findById(id).ifPresent(employee -> {
            employee.setName(employeeDTO.getName());
            employee.setMobile(employeeDTO.getMobile());
            employee.setSalary(employeeDTO.getSalary());
            employeeRepository.save(employee);
        });

    }


    public void deleteEmployee(String id) {

        employeeRepository.findById(id).ifPresent(employee -> {
            employeeRepository.deleteById(id);
        });
    }
}
