package com.aws.codepipeline;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping(value = "/getMessage")
    public String getMessage(){
        return "::::::: Hello AWS ::::::";
    }
}
