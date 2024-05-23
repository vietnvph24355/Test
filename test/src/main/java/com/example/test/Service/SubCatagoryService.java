package com.example.test.Service;

import com.example.test.entity.SupCategory;

import java.util.List;

public interface SubCatagoryService {

    List<SupCategory> getAll();

    SupCategory add(SupCategory s);

    SupCategory update(Long id, SupCategory s);
}
