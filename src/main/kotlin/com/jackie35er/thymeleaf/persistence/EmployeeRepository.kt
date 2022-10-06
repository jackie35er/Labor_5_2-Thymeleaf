package com.jackie35er.thymeleaf.persistence

import com.jackie35er.thymeleaf.domain.Employee
import com.jackie35er.thymeleaf.persistence.custom.CustomEmployeeRepository
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository: JpaRepository<Employee, String>, CustomEmployeeRepository  {

}