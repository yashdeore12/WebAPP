package com.yash.WebApp.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "hello meow";
    }

    @RequestMapping("/about")
    public String about(){
        return "mera namm yash ha ma 20 sal ka hu, mera pass aak billa ha";
    }
}
