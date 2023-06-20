package tech.bosrissilvam.llaves.dominio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.bosrissilvam.llaves.dominio.OrderDomain;
import tech.bosrissilvam.llaves.persistence.OrderRepository;
import tech.bosrissilvam.llaves.persistence.entity.Order;
import tech.bosrissilvam.llaves.persistence.entity.OrderDetail;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<OrderDomain> getAll(){
        return orderRepository.getAll();
    }

    public OrderDomain save(OrderDomain orderDomain){
        return orderRepository.save(orderDomain);
    }


}
