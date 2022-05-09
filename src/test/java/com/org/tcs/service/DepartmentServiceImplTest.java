package com.org.tcs.service;

import com.org.tcs.model.Department;
import com.org.tcs.repository.DepartmentRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentServiceImplTest {
    @InjectMocks
    private DepartmentServiceImpl departmentServiceImpl;
    @Mock
    private DepartmentRepo departmentRepo;
    @Test
    void createDepartment() {
        Department department=new Department();
        department.setId(100);
        department.setAddress("blr");
        departmentServiceImpl.createDepartment(department);
        Mockito.verify(departmentRepo,Mockito.times(1)).save(department);
    }
    @Test
    void getAll() {
        List<Department> list = new ArrayList<>();
        Department department = new Department();
        department.setId(100);
        department.setName("naveen");
        department.setAddress("hyd");
        list.add(department);
        Department department1 = new Department();
        department1.setId(101);
        department1.setName("naveen");
        department1.setAddress("hyd");
        list.add(department1);
        Mockito.when(departmentRepo.findAll()).thenReturn(list);
        List<Department> rrr=departmentServiceImpl.getAll();
        Assertions.assertEquals(list.size(),rrr.size());

    }

    @Test
    void updateDepartment() {
        Department department=new Department();
        department.setId(100);
        department.setAddress("blr");
        departmentServiceImpl.updateDepartment(department);
        Mockito.verify(departmentRepo,Mockito.times(1)).save(department);
    }

    @Test
    void deleteById() {
        int id=100;
        String value ="success";
        String value2=departmentServiceImpl.deleteById(id);
        Assertions.assertEquals(value,value2);

    }
}