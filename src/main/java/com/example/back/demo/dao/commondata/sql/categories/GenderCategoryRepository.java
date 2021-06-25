package com.example.back.demo.dao.commondata.sql.categories;

import com.example.back.demo.entity.commondata.sql.categories.GenderCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GenderCategoryRepository extends JpaRepository<GenderCategory, Integer> {

    @Query(value = "SELECT g FROM GenderCategory g")
    List<GenderCategory> getAllData();

    GenderCategory findByType(String gender);
}
