package com.javatechbd.simplecrud.employee;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "employees")
@Data
@ToString
public class Employee {

    @Id
    private String id;
    private String name;
    //@Column(name = "mobile_number")
    private String mobile;
    private Double salary;
    @Column(name = "created_at")
    private LocalDateTime createdAt; //created_at





}
