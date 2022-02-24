package com.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/mapping/users")
@RestController
public class MappingClassController {

    @GetMapping
    public String user(){
        return "get users";
    }

    @PostMapping
    public String addUser(){
        return "postuser";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId){
        return "get userId="+userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId){
        return "update userId="+userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId){
        return "delete userId="+userId;
    }
}

