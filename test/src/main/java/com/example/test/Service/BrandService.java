package com.example.test.Service;

import com.example.test.Dto.Reponse.ProductDTO;
import com.example.test.entity.Brand;
import com.example.test.entity.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BrandService {

    List<Brand> getAll();

    Brand add (Brand b);

    Brand update(Long id, Brand b);

}
