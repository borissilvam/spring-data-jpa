package tech.bosrissilvam.llaves.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tech.bosrissilvam.llaves.persistence.crud.ProductCrudRepository;
import tech.bosrissilvam.llaves.persistence.entity.Product;


import java.util.List;

@Repository
public class ProductRepository  {

    @Autowired
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){
        return productCrudRepository.findAll();
    }

    public Product save(Product product){
        return  productCrudRepository.save(product);
    }

    public void delete(int productId){
        productCrudRepository.deleteById(productId);
    }
}
