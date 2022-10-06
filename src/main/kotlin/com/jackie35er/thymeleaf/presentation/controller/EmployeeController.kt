package com.jackie35er.thymeleaf.presentation.controller

import com.jackie35er.thymeleaf.domain.Employee
import com.jackie35er.thymeleaf.persistence.EmployeeRepository
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/")
class EmployeeController(
    val employeeRepository: EmployeeRepository
) {

    @GetMapping
    fun getAllEmployees(model: Model): String{
        model.addAttribute("employees",employeeRepository.findAll())
        return "index"
    }

    @PostMapping(value = ["/details"])
    fun getEmployeeDetails(empId: String, model: Model): String {
        model.addAttribute("employee",employeeRepository.findById(empId).orElseThrow())
        return "employeeDetails"
    }
}