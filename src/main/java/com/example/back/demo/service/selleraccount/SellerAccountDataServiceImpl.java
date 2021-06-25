package com.example.back.demo.service.selleraccount;

import com.example.back.demo.dao.selleraccount.sql.SellerInfoRepository;
import com.example.back.demo.entity.authentification.UserInfo;
import com.example.back.demo.entity.selleraccount.sql.SellerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

@Service
public class SellerAccountDataServiceImpl implements SellerAccountDataService {

    @Autowired
    private SellerInfoRepository sellerInfoRepository;


    @Override
    public SellerInfo findSellerById(Integer sellerId) {
        return null;
    }

    public void save() {
//        AddressInfo addressInfo1 = new AddressInfo("2600 bay area blvd.", "Apt. 304", "77058", "Tx", "USA");
//        ContactInfo contactInfo = new ContactInfo("jmiller@gmail.com", "534636453", "345345353", null);
//        BankInfo bankInfo1 = new BankInfo("john", "miller", "Chase bank", "34345834", "0003424653");
//        BankInfo bankInfo2 = new BankInfo("john", "Filler", "Chase bank", "34345834", "0003424653");
//        bankInfo1.setAddressInfo(addressInfo1);
//        bankInfo1.setContactInfo(contactInfo);
//        bankInfo2.setContactInfo(contactInfo);
//        addressInfoRepository.save(addressInfo1);
//        contactInfoRepository.save(contactInfo);
//        bankInfoRepository.save(bankInfo1);
//        bankInfoRepository.save(bankInfo2);
    }

    @Override
    public void saveInMongo() {

    }

    public void createSellerAccount(UserInfo userInfo) {
        SellerInfo sellerInfo = new SellerInfo();
    }

}
