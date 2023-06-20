package tech.bosrissilvam.llaves.dominio;

import lombok.Data;

@Data
public class OrderDetailDomain {

    private int productDomainId;


    private int quantity;

    private double unitPrice;
}
