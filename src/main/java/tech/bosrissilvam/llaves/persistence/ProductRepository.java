package tech.bosrissilvam.llaves.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tech.bosrissilvam.llaves.dominio.ProductDomain;
import tech.bosrissilvam.llaves.dominio.repository.IProductRepository;
import tech.bosrissilvam.llaves.persistence.crud.ProductCrudRepository;
import tech.bosrissilvam.llaves.persistence.entity.Product;
import tech.bosrissilvam.llaves.persistence.mapper.ProductDomainMapper;


import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {

    @Autowired
    private ProductCrudRepository productCrudRepository;
    @Autowired
    private ProductDomainMapper mapper;

    @Override
    public List<ProductDomain> getALL() {
        List<Product> products = productCrudRepository.findAll();

        return mapper.toProductsDomains(products);
    }

    @Override
    public ProductDomain save(ProductDomain productDomain) {

        Product product = mapper.toProduct(productDomain);
        return mapper.toProductDomain(productCrudRepository.save(product));
    }
    @Override
    public void delete(int productId){
        productCrudRepository.deleteById(productId);
    }

}
