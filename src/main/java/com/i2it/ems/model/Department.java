package com.i2it.ems.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.i2it.ems.model.Employee;

/**
 * <p>
 * Department is a separate part, division, or branch, of a organization or business.
 * This class represent the Department Details like id and name.
 * </p>
 */

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private boolean isActive;
    
    @OneToMany(mappedBy = "department")
    private Set<Employee> employees;

    public Department() {
    } 

    public Department(String departmentName) {
        this.name = departmentName;
        this.isActive = true;
    }
    
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean getIsActive() {
        return this.isActive;
    } 

    public Set<Employee> getEmployees() {
        return this.employees;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsActive(boolean flag) {
        this.isActive = flag;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

}