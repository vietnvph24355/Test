package com.example.test.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "subcate_id",referencedColumnName = "id")
    private SupCategory subCateId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "color")
    private String color;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "sell_price")
    private Double sellPrice;

    @Column(name = "origin_price")
    private Double originPrice;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "status_id", referencedColumnName = "id")
    private Status statusId;

//    @OneToMany( fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL)
//    private List<ProductBrand> productBrands;
}
