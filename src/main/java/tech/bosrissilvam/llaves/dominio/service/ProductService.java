package tech.bosrissilvam.llaves.dominio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import tech.bosrissilvam.llaves.dominio.ProductDomain;
import tech.bosrissilvam.llaves.persistence.ProductRepository;
import tech.bosrissilvam.llaves.persistence.entity.Product;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductDomain> getAll(){
        return productRepository.getALL();
    }

    public ProductDomain save( ProductDomain productDomain){
        return productRepository.save(productDomain);
    }

    public boolean delete(int productDomainId){

         try {
             productRepository.delete(productDomainId);
             return true;
         } catch (EmptyResultDataAccessException e) {
             return false;
         }
    }
}
