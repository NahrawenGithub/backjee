package com.example.back.demo.dao.commondata.sql.info;

import com.example.back.demo.entity.commondata.sql.info.BankInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankInfoRepository extends JpaRepository<BankInfo, Integer> {

}
