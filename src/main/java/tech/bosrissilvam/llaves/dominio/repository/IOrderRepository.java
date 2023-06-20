package tech.bosrissilvam.llaves.dominio.repository;


import tech.bosrissilvam.llaves.dominio.OrderDomain;

import java.util.List;

public interface IOrderRepository {
    List<OrderDomain> getAll();
    OrderDomain save(OrderDomain orderDomain);

}
