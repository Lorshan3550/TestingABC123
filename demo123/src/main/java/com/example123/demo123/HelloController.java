package com.example123.demo123;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public ResponseEntity<String> retrieveAllCourses() {
        return ResponseEntity.ok("Hello World on Cloud");
    }
}
