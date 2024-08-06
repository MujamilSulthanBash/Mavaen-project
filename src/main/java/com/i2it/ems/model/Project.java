package com.i2it.ems.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.i2it.ems.model.Employee;

/**
 * <p>
 * Project is a piece of planned work or activity that is completed over a period of time and 
 * intended to achieve a particular aim. This class represent the Project Details like id and name.
 * </p>
 */

@Entity
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private boolean isActive;
    
    @ManyToMany(mappedBy = "projects")
    Set<Employee> employees;

    public Project() {
    } 

    public Project(String name) {
        this.name = name;
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