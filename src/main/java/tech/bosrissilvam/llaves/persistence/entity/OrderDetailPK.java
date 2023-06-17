package tech.bosrissilvam.llaves.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Data
@Embeddable
public class OrderDetailPK implements Serializable {

    @Column(name = "order_id")
    private Integer orderId;
    @Column(name = "product_id")
    private Integer productId;



}
