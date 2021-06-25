package com.example.back.demo.controller.selleraccount;

import com.example.back.demo.service.selleraccount.SellerAccountDataService;
import com.example.back.demo.entity.selleraccount.sql.SellerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellerAccountController {

    @Autowired
    private SellerAccountDataService sellerAccountDataService;

    @GetMapping("/save")
    public void saveAddress() {
        sellerAccountDataService.save();
    }

    @GetMapping("/seller/{id}")
    public SellerInfo getAddress(@PathVariable int id) {
        return sellerAccountDataService.findSellerById(id);
    }


    }

