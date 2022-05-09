package com.org.tcs.controller;

import com.org.tcs.model.Department;
import com.org.tcs.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import  java.util.Optional;

@RestController
@RequestMapping("/api")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/create")
    public void createDepartment(@RequestBody Department department){
        departmentService.createDepartment(department);
    }
    @GetMapping("/getAll")
    public List<Department>getAll(){
       List<Department> list= departmentService.getAll();
        return list;
    }

    @PutMapping("/update")
    public void updateDepartment(@RequestBody Department department){
        departmentService.updateDepartment(department);
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
       String rr= departmentService.deleteById(id);
        return "naveen";
    }
/*@GetMapping("/getById/{id}")
    public Department getById(@PathVariable Integer id){
       Department department = departmentService.getById(id);
       return null;*/



}
