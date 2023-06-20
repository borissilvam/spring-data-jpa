package tech.bosrissilvam.llaves.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tech.bosrissilvam.llaves.dominio.OrderDomain;
import tech.bosrissilvam.llaves.dominio.repository.IOrderRepository;
import tech.bosrissilvam.llaves.persistence.crud.OrderCrudReository;
import tech.bosrissilvam.llaves.persistence.entity.Order;
import tech.bosrissilvam.llaves.persistence.mapper.OrderDomainMapper;

import java.util.List;

@Repository
public class OrderRepository implements IOrderRepository {
    @Autowired
    private OrderCrudReository orderCrudReository;
    @Autowired
    private OrderDomainMapper mapper;
    @Override
    public List<OrderDomain> getAll() {
        List<Order> orders = orderCrudReository.findAll();
        return mapper.toOrdersDomains(orders);
    }

    @Override
    public OrderDomain save(OrderDomain orderDomain) {
        Order order = mapper.toOrder(orderDomain);

        order.getOrderDetails().forEach(orderDetail -> orderDetail.setOrder(order));

        return mapper.toOrderDomain(orderCrudReository.save(order));
    }
}
