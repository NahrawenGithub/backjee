package com.example.back.demo.dao.commondata.sql.images;

import com.example.back.demo.entity.commondata.sql.images.BrandImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BrandImagesRepository extends JpaRepository<BrandImages, Integer> {

    @Query(value = "SELECT DISTINCT b FROM BrandImages b")
    List<BrandImages> getAllData();
}
