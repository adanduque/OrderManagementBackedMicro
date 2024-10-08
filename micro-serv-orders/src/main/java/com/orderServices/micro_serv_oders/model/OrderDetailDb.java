package com.orderServices.micro_serv_oders.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailDb {
    private Long productId;
    private Integer quantity;
    private Double price;
}
