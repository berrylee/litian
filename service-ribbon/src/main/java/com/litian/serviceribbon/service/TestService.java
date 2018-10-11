package com.litian.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "testError")
    public String testService(String name) {
        return restTemplate.getForObject("http://SERVICE-TEST/test?name=" + name, String.class);
    }

    public String testError(String name) {
        return "test by " + name + ", sorry, error!";
    }
}
