package com.SpringOAuth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
     
    @GetMapping("/")
    public String greet(){
        return "Welcome to my Testing ground";
    }

}
