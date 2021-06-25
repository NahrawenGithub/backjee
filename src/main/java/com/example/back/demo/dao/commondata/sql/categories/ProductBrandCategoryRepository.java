package com.example.back.demo.dao.commondata.sql.categories;

import com.example.back.demo.entity.commondata.sql.categories.ProductBrandCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductBrandCategoryRepository extends JpaRepository<ProductBrandCategory, Integer> {

    @Query(value = "SELECT p FROM ProductBrandCategory p")
    List<ProductBrandCategory> getAllData();

    ProductBrandCategory findByType(String brandName);
}
