package com.i2it.ems.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;

import com.i2it.ems.model.Department;
import com.i2it.ems.model.Project;

/**
 * <p>
 * Employee is a person who is hired to work for another or for a business, This class represent 
 * the Employee Details like id, name, date of birth, and address.
 * </p>
 */
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    private String location;
    private boolean isActive;
    
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Project> projects;

    public Employee() {
    }
    
    public Employee(String name, 
                    LocalDate dateOfBirth, String location) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.location = location;
        this.isActive = true;
    }
    
    public int getId() {
        return this.id; 
    }

    public String getName() {
        return this.name; 
    }
 
    public LocalDate getDateOfBirth() {
        return this.dateOfBirth; 
    }

    public String getLocation() {
        return this.location; 
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public Department getDepartment() {
        return this.department;
    }

    public Set<Project> getProjects() {
        return this.projects;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dob) {
        this.dateOfBirth = dob;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setIsActive(boolean flag){
        this.isActive = flag;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    /**
     * <p>
     * This method is used to calculate the age of employee 
     * </p>
     *
     * @return String 
     *     - return the age and month
     */
    public String getAge() {
        LocalDate localDob = this.dateOfBirth;
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(localDob, currentDate); 
        return period.getYears() + "Y " + period.getMonths() + "M ".toString();
    }

    /**
     * <p>
     * This method is used to display the projects 
     * </p> 
     *
     * @return String 
     *     - return name of the projects
     */
    public String displayProjects() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Project project : this.projects) {
            stringBuilder.append(project.getName() + ", ");
        }
        return stringBuilder.toString();
    }
}