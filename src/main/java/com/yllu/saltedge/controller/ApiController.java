package com.yllu.saltedge.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {


    @GetMapping("/lol")
    public String getStringResponse() {
//        @NotNull @Valid InitialRequest initialRequest
        return "OK";
    }
}
