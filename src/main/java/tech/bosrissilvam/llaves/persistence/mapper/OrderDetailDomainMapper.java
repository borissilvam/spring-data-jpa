package tech.bosrissilvam.llaves.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import tech.bosrissilvam.llaves.dominio.OrderDetailDomain;
import tech.bosrissilvam.llaves.persistence.entity.OrderDetail;

@Mapper(componentModel = "spring")
public interface OrderDetailDomainMapper {

    @Mappings({
            @Mapping(source = "id.productId", target = "productDomainId"),
            @Mapping(source = "unitPrice", target = "unitPrice"),
            @Mapping(source = "quantity", target = "quantity")
    })
    OrderDetailDomain toOrderDetailDomain(OrderDetail orderDetail);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "order", ignore = true),
            @Mapping(target = "product", ignore = true),
            @Mapping(target = "id.orderId", ignore = true)
    })
    OrderDetail toOrderDetail(OrderDetailDomain orderDetailDomain);

}
