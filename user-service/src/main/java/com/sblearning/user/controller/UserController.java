package com.sblearning.user.controller;

import com.sblearning.user.entity.User;
import com.sblearning.user.service.UserService;
import com.sblearning.user.vo.UserResponseTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.PathParam;

@Slf4j
@RestController
@RequestMapping(value ="/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/")
    public User saveUser(@RequestBody User user)
    {
        log.info("inside the saveUser method of UserController ");
        return userService.saveUser(user);
    }
    @GetMapping(value = "/{id}")
    public UserResponseTemplate findUser(@PathVariable(value = "id") Long id)
    {
        log.info("inside the findUser method of UserService ");
        return userService.findByuserId(id);
    }
}
