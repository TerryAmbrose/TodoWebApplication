package com.ambrose.rest.Controllers;

import com.ambrose.rest.Objects.TodoObject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/getTodo")
    public TodoObject greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new TodoObject(name, false);
    }
}