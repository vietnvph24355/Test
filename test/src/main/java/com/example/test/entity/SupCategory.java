package com.example.test.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "SupCategory")
public class SupCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sub_cate_code")
    private String subCateCode;

    @Column(name = "sub_cate_name")
    private String subCateName;

    @ManyToOne
    @JoinColumn(name = "cate_id",referencedColumnName = "id")
    private Catagory cateId;
}
