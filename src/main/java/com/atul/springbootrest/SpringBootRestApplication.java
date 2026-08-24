package com.atul.springbootrest;

import com.atul.springbootrest.model.JobPost;
import com.atul.springbootrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestApplication.class, args);
    }

}
