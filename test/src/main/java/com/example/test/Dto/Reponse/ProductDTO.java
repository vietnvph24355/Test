package com.example.test.Dto.Reponse;

import com.example.test.entity.ProductBrand;
import com.example.test.entity.Status;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductDTO {

    private String productName;

    private List<ProductBrand> productBrands;

    private String color;

    private Long quantity;

    private Double sellPrice;

    private Double originPrice;

    private Status statusId;

}
