package tech.bosrissilvam.llaves.dominio.repository;

import tech.bosrissilvam.llaves.dominio.ProductDomain;


import java.util.List;

public interface IProductRepository {

    List<ProductDomain> getALL();
    ProductDomain save(ProductDomain productDomain);
    void delete(int productDomainId);

}
