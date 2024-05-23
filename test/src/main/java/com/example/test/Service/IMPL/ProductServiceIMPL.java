package com.example.test.Service.IMPL;

import com.example.test.Dto.Reponse.ProductDTO;
import com.example.test.Repository.ProductBrandRepository;
import com.example.test.Repository.ProductRipository;
import com.example.test.Service.ProductService;
import com.example.test.entity.Product;
import com.example.test.entity.ProductBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceIMPL implements ProductService {

    @Autowired
    private ProductRipository pr;

//    @Autowired
//    private ProductBrandRepository repository;

    @Override
    public List<Product> getAll() {
        return pr.findAll();
    }

    @Override
    public List<ProductDTO> getAll1() {
        return null;
    }

    @Override
    public Page<Product> getDetail(Integer page, Integer pageSize) {
        return null;
    }

    @Override
    public Product add(Product p) {
        return pr.save(p);
    }

    @Override
    public Product update(Long id, Product p) {
        //Optional optional
        return pr.save(p);
    }
}
