package com.example.test.Service;

import com.example.test.Dto.Reponse.ProductDTO;
import com.example.test.entity.Product;
import com.example.test.entity.ProductBrand;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    List<Product> getAll();
    List<ProductDTO> getAll1();

    Page<Product> getDetail(Integer page, Integer pageSize);

    Product add (Product p);

    Product update( Long id, Product p);

    //void search(String text);
}
