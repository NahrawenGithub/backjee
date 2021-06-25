package com.example.back.demo.model.selleraccount;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class UserInfo {
    private int id;

    private String firstName;

    private String lastName;

    private String userName;

    private String password;

    private String email;
}
