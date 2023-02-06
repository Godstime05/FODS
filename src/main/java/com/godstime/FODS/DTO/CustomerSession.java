package com.godstime.FODS.DTO;

import com.godstime.FODS.model.Address;
import com.godstime.FODS.model.Items;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

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
    private Integer restaurantId;

    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 3, max = 10, message = "Restaurent name should 3 to 10")
    private String restaurantName;

    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 3, max = 10, message = "Restaurent Manager Name name should 3 to 10")
    private String managerName;

    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 10, max = 10, message = "Contact Number should 3 to 10")
    private String phoneNumber;

    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 3, max = 10, message = "Password length should be 3 to 10")
    private String password;

    @Embedded
    private Address address;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Items> itemList = new ArrayList<>();

}
