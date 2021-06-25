package com.example.back.demo.service.selleraccount;


import com.example.back.demo.entity.selleraccount.sql.SellerInfo;

public interface SellerAccountDataService {

    public SellerInfo findSellerById(Integer sellerId);

    public void save();

    public void saveInMongo();

}

