package com.godstime.FODS.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;

    private LocalDateTime orderDate;

    //	@NonNull
//	@NotBlank
//	@NotEmpty
//	@Size(min = 3, max = 10, message = "Order Status should 3 to 10")
    private String orderStatus;

    @OneToOne(cascade = CascadeType.ALL)
    public Cart cart;
}
