package com.example.test.Repository;

import com.example.test.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRipository extends JpaRepository<Product, Long> {

//    @Query("SELECT pb from ProductBrand pb " +
//            " Inner Join Product p on pb.productId = p.id" +
//            " inner JOIN Brand b on pb.brandId = b.id" +
//            " inner  join SupCategory s on s.id = p.subCateId")
//    List<Product> getALl();
}
