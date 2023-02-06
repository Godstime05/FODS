package com.godstime.FODS.model;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
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
public class Restaurants {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer restaurantId;

    @NonNull
    @NotBlank
    @NotEmpty
    @Size(min = 3, max = 10, message = "Restaurent name should 3 to 10")
    private String restaurantName;

    @NonNull
    @NotBlank
    @NotEmpty
    @Size(min = 3, max = 10, message = "Restaurent Manager Name name should 3 to 10")
    private String managerName;

    @NonNull
    @NotBlank
    @NotEmpty
    @Size(min = 10, max = 10, message = "Contact Number should 3 to 10")
    private String contactNumber;

    @NonNull
    @NotBlank
    @NotEmpty
    @Size(min = 3, max = 10, message = "Password length should be 3 to 10")
    private String password;

    @Embedded
    private Address address;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Items> itemList = new ArrayList<>();

}
