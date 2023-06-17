package tech.bosrissilvam.llaves.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.bosrissilvam.llaves.persistence.entity.Order;

public interface OrderCrudRepository extends JpaRepository<Order, Long> {
}
