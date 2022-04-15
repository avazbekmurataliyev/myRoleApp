package com.myroleapp.springboot;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/home")
    public String home(){
        return "index";
    }
    @GetMapping("widgets.html")
public String widgets(){
        return "widgets";
    }
}
