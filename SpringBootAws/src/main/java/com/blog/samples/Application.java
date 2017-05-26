package com.blog.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.context.config.annotation.EnableContextCredentials;

@SpringBootApplication
@EnableContextCredentials(accessKey = "AKIAJVJDFZ3RBKU4XFBQ",secretKey = "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")
public class Application {
    
    public static void main(String[] args) {    	
        SpringApplication.run(Application.class, args);        
    }
}