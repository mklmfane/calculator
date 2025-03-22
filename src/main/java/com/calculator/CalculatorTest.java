package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CalculatorTest {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }

    //@GetMapping("/add/{num1}/{num2}")
    //public int add(@PathVariable int num1, @PathVariable int num2) {
    //    return num1 + num2;
    //}
}
