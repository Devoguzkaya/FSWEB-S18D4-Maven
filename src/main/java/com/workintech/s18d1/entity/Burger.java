package com.workintech.s18d1.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "burger", schema = "public")
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "is_vegan")
    private Boolean isVegan;

    @Enumerated(EnumType.STRING)
    @Column(name = "bread_type")
    private BreadType breadType;

    @ElementCollection
    @CollectionTable(name = "burger_ingredients", joinColumns = @JoinColumn(name = "burger_id"))
    @Column(name = "ingredient")
    private List<String> ingredients;
}
