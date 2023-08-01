package com.example.MyFirstAPIApplication;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeDatabase {

    @GetMapping("/employees")
    public String employee() {
        return "This is an Employee API endpoint!";

    }
    @PostMapping("/employees")
    public String addEmployee(@RequestBody String newEmployee) {
        return "Employees List: " + newEmployee;

    }

}
