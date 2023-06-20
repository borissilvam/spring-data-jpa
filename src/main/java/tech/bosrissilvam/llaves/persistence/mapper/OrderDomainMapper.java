package tech.bosrissilvam.llaves.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import tech.bosrissilvam.llaves.dominio.OrderDetailDomain;
import tech.bosrissilvam.llaves.dominio.OrderDomain;
import tech.bosrissilvam.llaves.persistence.entity.Order;

import java.util.List;

@Mapper(componentModel = "spring", uses = {OrderDetailDomain.class})
public interface OrderDomainMapper {
    @Mappings({
            @Mapping(source = "orderId", target = "orderDomainId"),
            @Mapping(source = "creationDate", target = "creationDate"),
            @Mapping(source = "orderDetails", target = "orderDetailDomainList")
    })
    OrderDomain toOrderDomain(Order order);
    List<OrderDomain> toOrdersDomains(List<Order> orders);

    @InheritInverseConfiguration
    @Mapping(target = "status", ignore = true)
    Order toOrder(OrderDomain orderDomain);

}
