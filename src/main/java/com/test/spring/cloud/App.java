package com.test.spring.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sheldon on 2018/7/3.
 */
@SpringBootApplication
@RestController
@RefreshScope
@EnableDiscoveryClient
public class App {
    @Value("${first.age}")
    private String name;

    public static void main(String [] args){
        SpringApplication.run(App.class, args);
    }

    @RequestMapping(value = "/")
    public String getName(){
        return this.name;
    }

}
