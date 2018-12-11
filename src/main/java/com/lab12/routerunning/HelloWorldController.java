package com.lab12.routerunning;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "Hello world!";
    }

    @RequestMapping("/capitalize/{contentToCapitalize}")
    public String capitalizePath(@PathVariable () String contentToCapitalize){
        return contentToCapitalize.toUpperCase();
    }

}
