package com.sblearning.department.service;

import com.sblearning.department.entity.Department;
import com.sblearning.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department saveDept(Department department) {
        log.info("inside saveDept of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findByDepartmentId(Long id) {
        log.info("inside findByDepartmentId of DepartmentController");
        return departmentRepository.findByDepartmentId(id);
    }
}
