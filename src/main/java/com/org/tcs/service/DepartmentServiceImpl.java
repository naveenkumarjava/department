package com.org.tcs.service;

import com.org.tcs.model.Department;
import com.org.tcs.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    DepartmentRepo departmentRepo;

    @Override
    public void createDepartment(Department department) {
        departmentRepo.save(department);
    }
    @Override
    public List<Department> getAll() {
        departmentRepo.findAll();
        return null;
    }
    @Override
    public void updateDepartment(Department department) {
        departmentRepo.save(department);
    }
    @Override
    public String deleteById(Integer id) {
        departmentRepo.deleteById(id);
        return null;
    }
/*
    @Override
    public Department getById(Integer id) {
     Department rr =departmentRepo.getById(id);
        return rr;
    }*/
}
