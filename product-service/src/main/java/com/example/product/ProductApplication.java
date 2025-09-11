package com.example.product;

import com.example.common.DateUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/products")
public class ProductApplication {

    @GetMapping("/time")
    public String getServerTime() {
        return "Product Service Time: " + DateUtils.now();
    }

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
