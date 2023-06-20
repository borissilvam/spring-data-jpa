package tech.bosrissilvam.llaves.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.bosrissilvam.llaves.persistence.entity.Order;

public interface OrderCrudReository  extends JpaRepository<Order, Integer> {
}
