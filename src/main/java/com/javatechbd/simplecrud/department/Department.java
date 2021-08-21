package com.javatechbd.simplecrud.department;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "departments")
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String departmentName;
    private String enabled;
}
