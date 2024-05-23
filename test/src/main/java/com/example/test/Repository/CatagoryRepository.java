package com.example.test.Repository;

import com.example.test.entity.Catagory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatagoryRepository extends JpaRepository<Catagory, Long> {
}
