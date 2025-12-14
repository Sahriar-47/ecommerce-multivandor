package com.nushops.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;

    private String description;

    private int mrpPrice;

    private int sellingPrice;

    private int discountPrice;

    private int quantity;

    private String color;

    @ElementCollection
    //creata a separate table for it.
    private List<String> images = new ArrayList<>();

    private int numRatings;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Seller seller;

    private LocalDateTime createdAt;

    private String sizes;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    //mappedBy used for bidirectional relationship.
    //and it placed on the inverse side.
    private List<Review> reviews = new ArrayList<>();
}
