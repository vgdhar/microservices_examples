package com.sblearning.department.controller;

import com.sblearning.department.entity.Department;
import com.sblearning.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/dept")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping(value = "/")
    public Department saveDept(@RequestBody Department department)
    {
        log.info("inside saveDept of DepartmentController");
        return departmentService.saveDept(department);
    }

    @GetMapping(value ="/{id}")
    public Department findByDepartmentId(@PathVariable("id") Long id)
    {
        log.info("inside findByDepartmentId of DepartmentController");
        return departmentService.findByDepartmentId(id);
    }
}
