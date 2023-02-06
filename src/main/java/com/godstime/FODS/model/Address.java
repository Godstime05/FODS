package com.godstime.FODS.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Address {

    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 3, max = 15, message = "House name should be between 3 to 15 characters")
    private String houseName;

    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 1, message = "Enter a valid street number")
    private String streetNo;

    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 3, max = 15, message = "street name should be between 3 and 15 characters")
    private String streetName;

    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 3, max = 15, message = "city name should be between 3 and 15 characters")
    private String city;

    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 3, max = 15, message = "State name should be between 3 and 15 characters")
    private String state;

    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 6, max = 6, message = "password should be 6 characters")
    private String pinCode;


}
