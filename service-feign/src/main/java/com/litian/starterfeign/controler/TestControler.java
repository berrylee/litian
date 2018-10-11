package com.litian.starterfeign.controler;

import com.litian.starterfeign.clients.SchedualServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControler {
    @Autowired
    SchedualServiceTest schedualServiceTest;

    @GetMapping(value = "/test")
    public String test(@RequestParam String name) {
        return schedualServiceTest.testFromClientOne( name );
    }
}
