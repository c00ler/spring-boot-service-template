package com.github.avenderov.controllers;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alexey Venderov.
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @GetMapping(value = "/{name}")
    public String hello(@PathVariable(value = "name") final String name) {
        return String.format("Hello, %s!", StringUtils.capitalize(name));
    }

}
