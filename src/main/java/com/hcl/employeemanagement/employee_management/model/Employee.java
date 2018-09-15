package com.hcl.employeemanagement.employee_management.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "SAP_ID")
    private int sapId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "DOJ")
    @Temporal(TemporalType.DATE)
    private Date doj;

    @Column(name = "EMAIL_ID")
    private String emailId;

    @Column(name = "DEPARTMENT")
    private  String department;

    @Column(name = "PROJECT_NAME")
    private  String projectName;

    public int getSapId() {
        return sapId;
    }

    public void setSapId(int sapId) {
        this.sapId = sapId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "sapId=" + sapId +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", doj=" + doj +
                ", emailId='" + emailId + '\'' +
                ", department='" + department + '\'' +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}
