package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.owasp.encoder.Encode;

import java.util.Collections;
@SpringBootApplication
@RestController
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(CalculatorApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8080"));
        app.run(args);  
    // Example of using org.owasp.encoder to encode user input
    String userInput = "<script>alert('XSS attack!');</script>";
    String encodedInput = Encode.forHtml(userInput);
    System.out.println(encodedInput);     //coment
    }

    @GetMapping("/add/{num1}/{num2}")
    public int add(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }
}