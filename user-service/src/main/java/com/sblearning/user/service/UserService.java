package com.sblearning.user.service;

import com.sblearning.user.entity.User;
import com.sblearning.user.repository.UserRepository;
import com.sblearning.user.vo.Department;
import com.sblearning.user.vo.UserResponseTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;


    public User saveUser(User user) {
        log.info("inside the saveUser method of UserService ");
        return userRepository.save(user);
    }


    public UserResponseTemplate findByuserId(Long id) {
        log.info("inside the findByuserId method of UserService ");
        UserResponseTemplate userResponseTemplate = new UserResponseTemplate();
        User user = userRepository.findByuserId(id);
        Department department = restTemplate.getForObject(("http://DEPARTMENT-SERVICE/dept/" + user.getDeptId() + "/"), Department.class);
        userResponseTemplate.setUser(user);
        userResponseTemplate.setDepartment(department);
        return userResponseTemplate;
    }
}