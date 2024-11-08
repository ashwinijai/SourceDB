package com.db.util.sourceDb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="EMPLOYEE", schema = "ABC")
public class Employee {
    @Id
    @Column(name="EMP_ID")
    private Long empId;
    @Column(name="EMP_NAME")
    private String empName;
    @Column(name="DEPT")
    private String dept;
    @Column(name="CITY")
    private String city;
}
