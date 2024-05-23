package com.example.test.Dto.Reponse;

import com.example.test.entity.Brand;
import com.example.test.entity.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductBrandDTO {

    private Product productId;

    private Brand brandId;
}
