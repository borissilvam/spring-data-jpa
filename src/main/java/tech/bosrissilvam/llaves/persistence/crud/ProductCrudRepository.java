package tech.bosrissilvam.llaves.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.bosrissilvam.llaves.persistence.entity.Product;

public interface ProductCrudRepository extends JpaRepository<Product, Integer> {
}
