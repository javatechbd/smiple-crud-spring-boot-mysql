package com.javatechbd.simplecrud.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {


    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping()
    public void createNewEmployee(@RequestBody EmployeeDTO employeeDTO) {
        System.out.println(employeeDTO);
        employeeService.createEmployee(employeeDTO);
    }


    @GetMapping("/{id}/employee")
    public ResponseEntity<?> getEmployeeById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(employeeService.getEmployeeById(id));
    }


    @PutMapping("/{id}/employee")
    public void updateEmployee(@PathVariable String id,
                               @RequestBody EmployeeDTO employeeDTO) {
        System.out.println(employeeDTO);
        employeeService.updateEmployee(id, employeeDTO);
    }


    @DeleteMapping("/{id}/employee")
    public void deleteEmployee(@PathVariable String id) {
        employeeService.deleteEmployee(id);
    }


}
