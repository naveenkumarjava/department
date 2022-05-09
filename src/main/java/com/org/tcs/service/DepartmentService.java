package com.org.tcs.service;

import com.org.tcs.model.Department;

import java.util.List;

public interface DepartmentService {
    public void createDepartment(Department department);
    public List<Department> getAll();
    public void updateDepartment(Department department);
    public String deleteById(Integer id);
    /*public String getById(Integer id);*/

}
