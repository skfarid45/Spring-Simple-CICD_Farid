package com.farid.Spring_CICD_Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
 @GetMapping("/Message")
    public String getMessage(){
     return "Hello , I am Shaik Fariddddd";
 }
}
