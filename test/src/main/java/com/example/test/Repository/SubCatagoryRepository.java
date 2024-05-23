package com.example.test.Repository;

import com.example.test.Dto.Reponse.SubCatagoryDTO;
import com.example.test.entity.SupCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCatagoryRepository extends JpaRepository<SupCategory, Long> {
}
