package com.java.Clientserver.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class testControleler {
    @PostMapping
    public ResponseEntity getAll(@RequestBody String name, String password){

        return ResponseEntity.ok(name + " " + password);
    }
}
