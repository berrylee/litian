package com.litian.starterfeign.clients;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceTestHystric implements SchedualServiceTest {
    @Override
    public String testFromClientOne(String name) {
        return "sorry " + name;
    }
}
