package com.sblearning.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
    @GetMapping(value = "/deptfallback")
    public String deptfallback()
    {
        return "Department-Service is not working at this moment. please try later";
    }

    @GetMapping(value = "/userfallback")
    public String userfallback()
    {
        return "User-Service is not working at this moment. please try later";
    }
}
