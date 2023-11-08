package com.microserviceproject.orderservice.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDto {

    private long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
