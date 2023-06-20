package tech.bosrissilvam.llaves.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import tech.bosrissilvam.llaves.dominio.ProductDomain;
import tech.bosrissilvam.llaves.persistence.entity.Product;

@Mapper(componentModel = "spring")
public interface ProductDomainMapper {

    @Mappings({
            @Mapping(source = "productId", target = "productDomainId"),
            @Mapping(source = "name", target = "nameProductDomain")
    })
    ProductDomain toProductDomain(Product product);

    @InheritInverseConfiguration
    @Mapping(target = "unitPrice", ignore = true)
    Product toProduct(ProductDomain productDomain);

}
