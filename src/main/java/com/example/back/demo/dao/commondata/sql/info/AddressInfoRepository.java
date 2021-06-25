package com.example.back.demo.dao.commondata.sql.info;

import com.example.back.demo.entity.commondata.sql.info.AddressInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressInfoRepository extends JpaRepository<AddressInfo, Integer> {

}
