package com.javatechbd.simplecrud.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private String name;
    private String mobile;
    private Double salary;
}
