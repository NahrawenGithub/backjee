package com.example.back.demo.service.authentification;

import com.example.back.demo.dao.authentification.UserInfoRepository;
import com.example.back.demo.entity.authentification.UserInfo;
import com.example.back.demo.util.authentification.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.Optional;

@Service
public class AuthDataServiceImpl implements AuthDataService {

    @Autowired
    private UserInfoRepository UserInfoRepository;

    public UserInfo findByUsername(String username) {
        Optional<UserInfo> result = UserInfoRepository.findByUsername(username);

        UserInfo userInfo = null;

        if(result.isPresent()) {
            userInfo = result.get();
        }

        return userInfo;
    }

    public UserInfo findByEmail(String email) {
        Optional<UserInfo> result = UserInfoRepository.findByEmail(email);

        UserInfo userInfo = null;

        if(result.isPresent()) {
            userInfo = result.get();
        }

        return userInfo;
    }

    public void createUserProfile(UserInfo userInfo) throws NoSuchAlgorithmException {
        UserInfoRepository.createUserProfile(userInfo.getUsername(),
                userInfo.getFirstName(), userInfo.getLastName(),
                userInfo.getEmail(), Md5Util.getInstance().getMd5Hash(userInfo.getPassword()));
    }

    public void deleteByUsernamePassword(String username, String password) throws NoSuchAlgorithmException {
        UserInfoRepository.deleteByUsernamePassword(username, Md5Util.getInstance().getMd5Hash(password));
    }
}
