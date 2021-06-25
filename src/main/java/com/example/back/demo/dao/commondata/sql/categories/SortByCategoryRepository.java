package com.example.back.demo.dao.commondata.sql.categories;

import com.example.back.demo.entity.commondata.sql.categories.SortByCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SortByCategoryRepository extends JpaRepository<SortByCategory, Integer> {

    @Query(value = "SELECT s FROM SortByCategory s")
    List<SortByCategory> getAllData();

    SortByCategory findByType(String type);
}
