package com.godstime.FODS.DTO;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
public class RestaurantSession {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique=true)
    private Integer restaurantId;
    private String uniqueId;
    private LocalDateTime timeStamp;

    public RestaurantSession(Integer restaurantId, String uniqueId, LocalDateTime timeStamp) {
        super();
        this.restaurantId = restaurantId;
        this.uniqueId = uniqueId;
        this.timeStamp = timeStamp;
    }
}
