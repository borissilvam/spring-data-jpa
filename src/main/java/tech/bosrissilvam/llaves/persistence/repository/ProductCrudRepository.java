package tech.bosrissilvam.llaves.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.bosrissilvam.llaves.persistence.entity.Product;

public interface ProductCrudRepository extends JpaRepository<Product, Long> {

}
