package com.godstime.FODS.DTO;

import com.godstime.FODS.model.Address;
import com.godstime.FODS.model.Items;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerSession {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private Integer customerId;

    private String uniqueId;

    private LocalDateTime timeStamp;

    public CustomerSession(Integer customerId, String uniqueId, LocalDateTime timeStamp){
        super();
        this.customerId = customerId;
        this.uniqueId = uniqueId;
        this.timeStamp = timeStamp;
    }
//
//
}
