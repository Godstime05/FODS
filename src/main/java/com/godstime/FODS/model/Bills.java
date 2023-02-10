package com.godstime.FODS.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Bills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer billId;

    private String customerName;

    private LocalDateTime billDate;

    private Double totalCost;

    private Integer totalItems;

    @ManyToOne
    @JoinColumn(name = "order_details_order_id")
    private OrderDetails orderDetails;

    @Embedded
    Address custAddress;
}
