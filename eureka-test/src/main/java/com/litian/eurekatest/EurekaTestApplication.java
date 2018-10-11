package com.litian.eurekatest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaTestApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/test")
    public String home(@RequestParam(value = "name", defaultValue = "litian") String name) {
        return "test by " + name + " ,i am from port:" + port;
    }
}
