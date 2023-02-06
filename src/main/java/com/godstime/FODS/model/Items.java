package com.godstime.FODS.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer itemId;

    @Size(min = 3, max = 10, message = "Category name must be between 3 and ten characters")
    private String category;

    @Size(min = 3, max = 10, message = "Item name must be between 3 and ten characters")
    private String itemName;

    private Integer quantity;
    private BigDecimal unitCost;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "itemList")
    private List<Restaurants> restaurantsList = new ArrayList<>();

}
