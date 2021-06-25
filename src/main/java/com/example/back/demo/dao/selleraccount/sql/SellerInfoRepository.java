package com.example.back.demo.dao.selleraccount.sql;

import com.example.back.demo.entity.selleraccount.sql.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerInfoRepository extends JpaRepository<SellerInfo, Integer> {
}
