package com.study.cicd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "hello world!! 😁";
    }
}
