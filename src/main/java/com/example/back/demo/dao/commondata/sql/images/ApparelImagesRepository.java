package com.example.back.demo.dao.commondata.sql.images;

import com.example.back.demo.entity.commondata.sql.images.ApparelImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ApparelImagesRepository extends JpaRepository<ApparelImages, Integer> {

    @Query(value = "SELECT DISTINCT c FROM ApparelImages c")
    List<ApparelImages> getAllData();
}
