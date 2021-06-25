package com.example.back.demo.model.authentification;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AuthenticationRequest {

    private String username;
    private String password;
}
