package com.example.test.Service;

import com.example.test.entity.Catagory;

import java.util.List;

public interface CatagoryService {

    List<Catagory> getAll();

    Catagory add (Catagory c);

    Catagory update(Long id, Catagory c);
}
