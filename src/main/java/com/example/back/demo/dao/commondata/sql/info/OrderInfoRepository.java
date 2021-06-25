package com.example.back.demo.dao.commondata.sql.info;

import com.example.back.demo.entity.commondata.sql.info.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderInfoRepository extends JpaRepository<OrderInfo, Integer> {
}
