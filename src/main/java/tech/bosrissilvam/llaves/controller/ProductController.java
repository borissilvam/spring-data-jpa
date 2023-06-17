package tech.bosrissilvam.llaves.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tech.bosrissilvam.llaves.persistence.entity.Product;
import tech.bosrissilvam.llaves.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/all")
    public List<Product> getAll(){

        return productService.getAll();
    }
    @PostMapping("/save")
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }

}
