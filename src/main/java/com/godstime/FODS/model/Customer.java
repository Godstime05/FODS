package com.godstime.FODS.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;

    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 3, max = 10, message = "first name should 3 to 10")
    private String firstName;

    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 3, max = 10, message = "last name should 3 to 10")
    private String lastName;

    //	@NonNull
//	@NotBlank
//	@NotEmpty
//	@Min(value = 10, message = "minimum age required 10 for registration")
    private Integer age;

    @NotBlank
    @NotEmpty
    private String gender;

    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 10, max = 10, message = "mobile number must be 10 digit only")
    private String mobileNumber;
    private String email;
    private String password;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JsonIgnore
//	public Cart cart;
//

    @Embedded
    private Address address;
}
