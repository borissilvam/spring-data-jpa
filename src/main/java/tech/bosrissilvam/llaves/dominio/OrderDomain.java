package tech.bosrissilvam.llaves.dominio;


import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDomain {

    private int orderDomainId;

    private LocalDateTime creationDate;

    private List<OrderDetailDomain> orderDetailDomainList;

}
