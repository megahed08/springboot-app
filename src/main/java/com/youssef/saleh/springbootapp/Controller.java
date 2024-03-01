package com.youssef.saleh.springbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path="/pressSimple")
    public String returnSimple(){
        return "Simple";
    }

}
