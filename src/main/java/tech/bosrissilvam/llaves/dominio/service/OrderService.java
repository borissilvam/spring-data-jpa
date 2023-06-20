package tech.bosrissilvam.llaves.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.bosrissilvam.llaves.persistence.entity.Order;
import tech.bosrissilvam.llaves.persistence.entity.OrderDetail;
import tech.bosrissilvam.llaves.persistence.entity.OrderDetailPK;
import tech.bosrissilvam.llaves.persistence.repository.OrderCrudRepository;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderCrudRepository orderCrudRepository;

    public List<Order> getAll(){
        return orderCrudRepository.findAll();

    }

    public Order save(Order order) {
        Order saveOrder = order;
        List<OrderDetail> orderDetails = saveOrder.getOrderDetails();

        // Asignar el ID de Order a cada OrderDetail
        orderDetails.forEach(orderDetail -> {
            orderDetail.setOrder(saveOrder);
        });

        return orderCrudRepository.save(saveOrder);
    }
}
