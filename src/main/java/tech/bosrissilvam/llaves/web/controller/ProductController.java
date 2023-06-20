package tech.bosrissilvam.llaves.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.bosrissilvam.llaves.dominio.ProductDomain;
import tech.bosrissilvam.llaves.persistence.entity.Product;
import tech.bosrissilvam.llaves.dominio.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/all")
    public ResponseEntity<List<ProductDomain>> getAll(){
        return new ResponseEntity<>(productService.getAll(), HttpStatus.OK) ;
    }
    @PostMapping("/save")
    public ResponseEntity<ProductDomain>  save(@RequestBody ProductDomain productDomain){
        return new ResponseEntity<>( productService.save(productDomain), HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int productDomainId){

        if (productService.delete(productDomainId)){
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }
}
