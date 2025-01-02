package com.library.lib_management_app.entity;

import jakarta.persistence.*;
import java.util.List;

    @Entity
    public class Position {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long positionId;

        private String positionName;
        private String description;

        @OneToMany(mappedBy = "position")
        private List<Employee> employees;

        // Getters and Setters
        public Long getPositionId() {
            return positionId;
        }

        public void setPositionId(Long positionId) {
            this.positionId = positionId;
        }

        public String getPositionName() {
            return positionName;
        }

        public void setPositionName(String positionName) {
            this.positionName = positionName;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public List<Employee> getEmployees() {
            return employees;
        }

        public void setEmployees(List<Employee> employees) {
            this.employees = employees;
        }
    }


