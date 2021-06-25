package com.example.back.demo.model.authentification;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AuthenticationResponse {

    private String jwt;
    private String error;
    private String firstName;
}