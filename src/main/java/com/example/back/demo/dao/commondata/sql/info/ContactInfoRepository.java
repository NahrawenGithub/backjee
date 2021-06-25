package com.example.back.demo.dao.commondata.sql.info;

import com.example.back.demo.entity.commondata.sql.info.ContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactInfoRepository extends JpaRepository<ContactInfo, Integer> {
}
