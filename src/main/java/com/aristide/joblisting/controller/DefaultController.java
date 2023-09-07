package com.aristide.joblisting.controller;


import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class DefaultController {

    @Hidden
    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public String home() throws IOException {
        return "API";
    }

}
