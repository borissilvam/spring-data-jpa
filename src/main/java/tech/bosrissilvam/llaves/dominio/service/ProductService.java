package tech.bosrissilvam.llaves.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.bosrissilvam.llaves.persistence.entity.Product;
import tech.bosrissilvam.llaves.persistence.repository.OrderCrudRepository;
import tech.bosrissilvam.llaves.persistence.repository.ProductCrudRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){
        return productCrudRepository.findAll();
    }

    public Product save(Product product){
        return productCrudRepository.save(product);
    }
}
