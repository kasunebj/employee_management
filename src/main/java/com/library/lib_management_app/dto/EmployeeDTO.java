package com.library.lib_management_app.dto;

public class EmployeeDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String departmentName;

    // Constructor
    public EmployeeDTO(Long id, String firstName, String lastName, String departmentName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
